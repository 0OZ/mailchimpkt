package dev.zwei.mailchimp.domain.mailChimp.apiObjects.campaigns

data class Schedule(
    val daily_send: DailySend?,
    val hour: Int?,
    val monthly_send_date: Int?,
    val weekly_send_day: String?
)