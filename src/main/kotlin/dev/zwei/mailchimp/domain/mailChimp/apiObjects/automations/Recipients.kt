package dev.zwei.mailchimp.domain.mailChimp.apiObjects.automations

data class Recipients(
    val list_id: String?,
    val list_is_active: Boolean?,
    val list_name: String?,
    val segment_opts: dev.zwei.mailchimp.domain.mailChimp.apiObjects.automations.SegmentOpts?,
    val store_id: String?
)