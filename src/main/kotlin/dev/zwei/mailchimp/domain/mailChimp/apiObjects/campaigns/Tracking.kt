package dev.zwei.mailchimp.domain.mailChimp.apiObjects.campaigns

data class Tracking(
    val capsule: Capsule?,
    val clicktale: String?,
    val ecomm360: Boolean?,
    val goal_tracking: Boolean?,
    val google_analytics: String?,
    val html_clicks: Boolean?,
    val opens: Boolean?,
    val salesforce: Salesforce?,
    val text_clicks: Boolean?
)