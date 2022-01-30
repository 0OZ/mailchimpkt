package dev.zwei.mailchimp.domain.mailChimp.apiObjects.campaigns

data class DeliveryStatus(
    val can_cancel: Boolean?,
    val emails_canceled: Int?,
    val emails_sent: Int?,
    val enabled: Boolean?,
    val status: String?
)