package dev.zwei.mailchimp.domain.mailChimp.apiObjects.campaigns

data class Recipients(
    val list_id: String?,
    val list_is_active: Boolean?,
    val list_name: String?,
    val recipient_count: Int?,
    val segment_opts: SegmentOpts?,
    val segment_text: String?
)