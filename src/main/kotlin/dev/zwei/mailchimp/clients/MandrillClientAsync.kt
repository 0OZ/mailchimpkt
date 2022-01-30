package dev.zwei.mailchimp.clients

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.http.*

class MandrillClientAsync(val apiKey: String) {
    val mapper: ObjectMapper = jacksonObjectMapper().registerKotlinModule()
    val client = HttpClient(CIO) { jsonRequests() }

    fun url(path: String) = "https://mandrillapp.com/api/1.0$path"
}

interface Body<out T> {
    var key: String?
}

class ApiKey(override var key: String?) : Body<ApiKey>

suspend inline fun <reified T> MandrillClientAsync.post(path: String) =
    MandrillClientAsync(apiKey).post<T, ApiKey>(path, ApiKey(apiKey))

suspend inline fun <reified T, K> MandrillClientAsync.post(path: String, body: Body<K>) =
    mapper.readValue(client.post<String?>(url(path)) {
        contentType(ContentType.Application.Json)
        this.body = mapper.writeValueAsString(body.apply { key = apiKey })
    }!!) as T