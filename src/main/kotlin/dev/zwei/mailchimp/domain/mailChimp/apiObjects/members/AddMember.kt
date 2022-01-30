package dev.zwei.mailchimp.domain.mailChimp.members

import dev.zwei.mailchimp.domain.mailChimp.apiObjects.members.MarketingPermission
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import dev.zwei.mailchimp.domain.mailChimp.apiObjects.members.Interests

@JsonIgnoreProperties(ignoreUnknown = true)
data class UpdateMember(
    val email_address: String,
    val email_type: String = EmailType.html,
    val status: String = Status.subscribed,
    val interests: Interests? = null,
    val ip_opt: String? = null,
    val ip_signup: String? = null,
    val language: String? = null,
    val location: Location? = null,
    val marketing_permissions: List<Any>? = null,
    val merge_fields: Any? = mapOf<String, String>(),
    val tags: List<String?>? = listOf(),
    /**
     * Subscriber's status. This value is required only if the email address is not already present on the list. Possible values: "subscribed", "unsubscribed", "cleaned", "pending", or "transactional".
     */
    val status_if_new: String? = null,
    val timestamp_opt: String? = null,
    val timestamp_signup: String? = null,
    val vip: Boolean? = null
)

data class AddMember(
    val email_address: String,
    val status: String = Status.pending,
    val email_type: String = EmailType.html,
    val marketing_permissions: List<MarketingPermission?> = listOf(),
    val interests: Map<String, String>? = mapOf(),
    val ip_opt: String? = "",
    val ip_signup: String? = "",
    val language: String? = "",
    val location: Any? = mapOf<String, String>(),
    val merge_fields: Any? = mapOf<String, String>(),
    val tags: List<String?>? = listOf(),
    val timestamp_opt: String = "2019-08-24T14:15:22Z",
    val timestamp_signup: String = "2019-08-24T14:15:22Z",
    val vip: Boolean? = false
)

data class Location(val latitude: String?, val longitude: String?)

object EmailType {
    const val html = "html"
    const val text = "text"
}

object Status {
    const val subscribed = "subscribed"
    const val unsubscribed = "unsubscribed"
    const val cleaned = "cleaned"
    const val pending = "pending"
    const val transactional = "transactional"
}