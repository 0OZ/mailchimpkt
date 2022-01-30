package dev.zwei.mailchimp.domain.mailChimp.apiObjects.campaigns

data class ReportSummary(
    val click_rate: Int?,
    val clicks: Int?,
    val ecommerce: Ecommerce?,
    val open_rate: Int?,
    val opens: Int?,
    val subscriber_clicks: Int?,
    val unique_opens: Int?
)