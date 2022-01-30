package dev.zwei.mailchimp.domain.mailChimp.apiObjects.lists

data class Stats(
    val avg_sub_rate: Int?,
    val avg_unsub_rate: Int?,
    val campaign_count: Int?,
    val campaign_last_sent: String?,
    val cleaned_count: Int?,
    val cleaned_count_since_send: Int?,
    val click_rate: Int?,
    val last_sub_date: String?,
    val last_unsub_date: String?,
    val member_count: Int?,
    val member_count_since_send: Int?,
    val merge_field_count: Int?,
    val open_rate: Int?,
    val target_sub_rate: Int?,
    val total_contacts: Int?,
    val unsubscribe_count: Int?,
    val unsubscribe_count_since_send: Int?
)