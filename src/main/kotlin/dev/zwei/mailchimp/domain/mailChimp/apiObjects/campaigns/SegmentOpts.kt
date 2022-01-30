package dev.zwei.mailchimp.domain.mailChimp.apiObjects.campaigns

data class SegmentOpts(
    val conditions: List<Any>?,
    val match: String?,
    val prebuilt_segment_id: String?,
    val saved_segment_id: Int?
)