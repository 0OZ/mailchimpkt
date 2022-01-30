package dev.zwei.mailchimp.clients

import dev.zwei.mailchimp.configuration.MailChimpConfig
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import dev.zwei.mailchimp.extension.toMD5
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.auth.*
import io.ktor.client.features.auth.providers.*
import io.ktor.client.request.*
import io.ktor.http.*
import java.math.BigInteger
import java.security.MessageDigest

fun HttpClientConfig<CIOEngineConfig>.jsonRequests() {
    engine {
        request {
            headers { headersOf("Content-Type" to listOf(ContentType.Application.Json.toString())) }
        }
    }
}

class MailChimpClientAsync(private val config: MailChimpConfig) {
    val mapper: ObjectMapper = jacksonObjectMapper().registerKotlinModule()
    val client = HttpClient(CIO) {
        install(Auth)
        {
            basic {
                sendWithoutRequest { true }
                credentials { BasicAuthCredentials("anystring", config.apiKey) }
            }
        }
        jsonRequests()
    }

    fun url(path: () -> String): String = "https://${config.dataCenter}.api.mailchimp.com/3.0${path()}"


    suspend fun patch(path: String) = client.patch<String?>(url { path })
    suspend fun delete(path: String, email: String) = client.delete<String?>(url {
        val md5mail = email.lowercase().toMD5()
        "$path/$md5mail"
    })
}

suspend inline fun <reified T> MailChimpClientAsync.get(path: String) =
    mapper.readValue(client.get<String?>(url { path })!!) as T

suspend inline fun <reified T, K> MailChimpClientAsync.post(path: String, body: K): T? {
    val response = client.post<String?>(url { path }) {
        contentType(ContentType.Application.Json)
        this.body = mapper.writeValueAsString(body)
    }

    return when (response.isNullOrBlank()) {
        true -> null
        else -> mapper.readValue(response) as T
    }

}

suspend inline fun <reified T, K> MailChimpClientAsync.put(path: String, body: K) =
    mapper.readValue(client.put<String?>(url { path }) {
        contentType(ContentType.Application.Json)
        this.body = mapper.writeValueAsString(body)
    }!!) as T