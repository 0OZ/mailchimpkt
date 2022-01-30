package dev.zwei.mailchimp.domain.mailChimp.apiObjects.automations

data class SegmentOpts(
    val conditions: List<Any>?,
    val match: String?,
    val saved_segment_id: Int?
)