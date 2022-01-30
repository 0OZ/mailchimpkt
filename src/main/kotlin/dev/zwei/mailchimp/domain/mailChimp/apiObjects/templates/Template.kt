package dev.zwei.mailchimp.domain.mailChimp.apiObjects.templates

import dev.zwei.mailchimp.domain.mailChimp.apiObjects.Link
import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class Template(
    val _links: List<Link>?,
    val active: Boolean?,
    val category: String?,
    val created_by: String?,
    val date_created: String?,
    val date_edited: String?,
    val drag_and_drop: Boolean?,
    val edited_by: String?,
    val id: Int?,
    val name: String?,
    val responsive: Boolean?,
    val share_url: String?,
    val thumbnail: String?,
    val type: String?
)