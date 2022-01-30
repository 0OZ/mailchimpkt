package dev.zwei.mailchimp.domain.mailChimp.apiObjects.members

data class MarketingPermission(
    val enabled: Boolean?,
    val marketing_permission_id: String? = null,
    val text: String? = null
)