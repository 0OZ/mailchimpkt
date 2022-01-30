package dev.zwei.mailchimp.domain.mailChimp.apiObjects.lists

import dev.zwei.mailchimp.domain.mailChimp.apiObjects.Link
import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class MailChimpList(
    val _links: List<Link>?,
    val beamer_address: String?,
    val campaign_defaults: CampaignDefaults?,
    val contact: Contact?,
    val date_created: String?,
    val double_optin: Boolean?,
    val email_type_option: Boolean?,
    val has_welcome: Boolean?,
    val id: String?,
    val list_rating: Int?,
    val marketing_permissions: Boolean?,
    val modules: List<String>?,
    val name: String?,
    val notify_on_subscribe: Boolean?,
    val notify_on_unsubscribe: Boolean?,
    val permission_reminder: String?,
    val stats: dev.zwei.mailchimp.domain.mailChimp.apiObjects.lists.Stats?,
    val subscribe_url_long: String?,
    val subscribe_url_short: String?,
    val use_archive_bar: Boolean?,
    val visibility: String?,
    val web_id: Int?
)