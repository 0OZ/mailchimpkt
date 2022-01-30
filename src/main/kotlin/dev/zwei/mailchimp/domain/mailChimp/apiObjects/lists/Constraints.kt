package dev.zwei.mailchimp.domain.mailChimp.apiObjects.lists

data class Constraints(
    val current_total_instances: Int?,
    val max_instances: Int?,
    val may_create: Boolean?
)