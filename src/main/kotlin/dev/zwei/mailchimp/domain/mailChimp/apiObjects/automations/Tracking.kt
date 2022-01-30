package dev.zwei.mailchimp.domain.mailChimp.apiObjects.automations

data class Tracking(
    val capsule: dev.zwei.mailchimp.domain.mailChimp.apiObjects.automations.Capsule?,
    val clicktale: String?,
    val ecomm360: Boolean?,
    val goal_tracking: Boolean?,
    val google_analytics: String?,
    val html_clicks: Boolean?,
    val opens: Boolean?,
    val salesforce: dev.zwei.mailchimp.domain.mailChimp.apiObjects.automations.Salesforce?,
    val text_clicks: Boolean?
)