package dev.zwei.mailchimp.domain.mailChimp.apiObjects.lists

import dev.zwei.mailchimp.domain.mailChimp.apiObjects.Link

data class Lists(
    val _links: List<Link>?,
    val constraints: Constraints?,
    val lists: List<MailChimpList>?,
    val total_items: Int?
)