package dev.zwei.mailchimp.domain.mandrill.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

class TemplateResponse : ArrayList<TemplateResponseItem>()

@JsonIgnoreProperties(ignoreUnknown = true)
data class TemplateResponseItem(
    val code: String?,
    val created_at: String?,
    val from_email: String?,
    val from_name: String?,
    val labels: List<String>?,
    val name: String?,
    val publish_code: String?,
    val publish_from_email: String?,
    val publish_from_name: String?,
    val publish_name: String?,
    val publish_subject: String?,
    val publish_text: String?,
    val published_at: String?,
    val slug: String?,
    val subject: String?,
    val text: String?,
    val updated_at: String?
)