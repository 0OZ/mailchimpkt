package dev.zwei.mailchimp.domain.mandrill.valueObjects

import dev.zwei.mailchimp.clients.Body

data class SendTemplate(
    val async: Boolean? = null,
    val ip_pool: String? = null,
    val message: Message? = null,
    val send_at: String? = null,
    val template_content: List<Any>? = null,
    val template_name: String? = null,
    override var key: String? = null,
) : Body<Any>

class SendTemplateResponse : ArrayList<SendTemplateResponseItem>()

data class SendTemplateResponseItem(
    val _id: String?,
    val email: String?,
    val reject_reason: String?,
    val status: String?
)