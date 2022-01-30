package dev.zwei.mailchimp.domain.mailChimp.apiObjects

data class Link(
    val href: String?,
    val method: String?,
    val rel: String?,
    val schema: String?,
    val targetSchema: String?
)