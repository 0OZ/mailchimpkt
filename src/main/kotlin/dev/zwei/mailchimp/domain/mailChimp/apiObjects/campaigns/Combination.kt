package dev.zwei.mailchimp.domain.mailChimp.apiObjects.campaigns

data class Combination(
    val content_description: Int?,
    val from_name: Int?,
    val id: String?,
    val recipients: Int?,
    val reply_to: Int?,
    val send_time: Int?,
    val subject_line: Int?
)