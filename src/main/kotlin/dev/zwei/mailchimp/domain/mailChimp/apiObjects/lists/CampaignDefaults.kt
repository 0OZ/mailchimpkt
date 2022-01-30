package dev.zwei.mailchimp.domain.mailChimp.apiObjects.lists

data class CampaignDefaults(
    val from_email: String?,
    val from_name: String?,
    val language: String?,
    val subject: String?
)