package dev.zwei.mailchimp.domain.mailChimp.apiObjects.campaigns

data class VariateSettings(
    val combinations: List<Combination>?,
    val contents: List<String>?,
    val from_names: List<String>?,
    val reply_to_addresses: List<String>?,
    val send_times: List<String>?,
    val subject_lines: List<String>?,
    val test_size: Int?,
    val wait_time: Int?,
    val winner_criteria: String?,
    val winning_campaign_id: String?,
    val winning_combination_id: String?
)