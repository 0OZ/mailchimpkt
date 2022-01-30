package dev.zwei.mailchimp.domain.mailChimp.apiObjects.templates

import dev.zwei.mailchimp.domain.mailChimp.apiObjects.Link

data class Templates(
    val _links: List<Link>?,
    val templates: List<Template>?,
    val total_items: Int?
)