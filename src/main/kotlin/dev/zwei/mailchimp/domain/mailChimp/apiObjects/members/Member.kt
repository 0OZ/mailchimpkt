package dev.zwei.mailchimp.domain.mailChimp.apiObjects.members

import dev.zwei.mailchimp.domain.mailChimp.apiObjects.Link
import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class Member(
    val _links: List<Link>?,
    val email_address: String?,
    val email_client: String?,
    val email_type: String?,
    val full_name: String?,
    val id: String?,
    val interests: Interests?,
    val ip_opt: String?,
    val ip_signup: String?,
    val language: String?,
    val last_changed: String?,
    val last_note: LastNote?,
    val list_id: String?,
    val location: Location?,
    val marketing_permissions: List<MarketingPermission>?,
    val member_rating: Int?,
    val merge_fields: MergeFields?,
    val source: String?,
    val stats: Stats?,
    val status: String?,
    val tags: List<Tag>?,
    val tags_count: Int?,
    val timestamp_opt: String?,
    val timestamp_signup: String?,
    val unique_email_id: String?,
    val unsubscribe_reason: String?,
    val vip: Boolean?,
    val web_id: Int?
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class Interests(val property1: Boolean? = null, val property2: Boolean? = null)

data class UpdateTag(val name: String, val status: String = "active")
data class TagsRequest(val tags: List<UpdateTag?>, val is_syncing: Boolean = false)