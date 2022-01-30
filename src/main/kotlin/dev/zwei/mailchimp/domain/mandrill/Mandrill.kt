package dev.zwei.mailchimp.domain.mandrill

import dev.zwei.mailchimp.clients.MandrillClientAsync
import dev.zwei.mailchimp.clients.post
import dev.zwei.mailchimp.configuration.MandrillConfig
import dev.zwei.mailchimp.domain.mandrill.response.TemplateResponse
import dev.zwei.mailchimp.domain.mandrill.valueObjects.SendTemplate
import dev.zwei.mailchimp.domain.mandrill.valueObjects.SendTemplateResponse
import kotlinx.coroutines.runBlocking

class Mandrill(
    block: MandrillConfig.() -> Unit = {},
) {
    private val config = MandrillConfig.apply(block)
    private val mca = MandrillClientAsync(config.apiKey)

    fun listTemplates(): TemplateResponse = runBlocking {
        mca.post("/templates/list")
    }

    fun sendTemplate(name: String): SendTemplateResponse = runBlocking {
        mca.post("/messages/send-template", SendTemplate(template_name = name))
    }
}