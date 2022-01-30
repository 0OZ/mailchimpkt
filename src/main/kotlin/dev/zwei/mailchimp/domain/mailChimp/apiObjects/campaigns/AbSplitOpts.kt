package dev.zwei.mailchimp.domain.mailChimp.apiObjects.campaigns

data class AbSplitOpts(
    val from_name_a: String?,
    val from_name_b: String?,
    val pick_winner: String?,
    val reply_email_a: String?,
    val reply_email_b: String?,
    val send_time_a: String?,
    val send_time_b: String?,
    val send_time_winner: String?,
    val split_size: Int?,
    val split_test: String?,
    val subject_a: String?,
    val subject_b: String?,
    val wait_time: Int?,
    val wait_units: String?
)