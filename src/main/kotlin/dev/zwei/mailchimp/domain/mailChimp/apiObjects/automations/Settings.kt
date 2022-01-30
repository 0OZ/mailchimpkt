package dev.zwei.mailchimp.domain.mailChimp.apiObjects.automations

data class Settings(
    val authenticate: Boolean?,
    val auto_footer: Boolean?,
    val from_name: String?,
    val inline_css: Boolean?,
    val reply_to: String?,
    val title: String?,
    val to_name: String?,
    val use_conversation: Boolean?
)