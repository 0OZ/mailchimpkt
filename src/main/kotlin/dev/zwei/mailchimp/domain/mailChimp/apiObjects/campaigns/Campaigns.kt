package dev.zwei.mailchimp.domain.mailChimp.apiObjects.campaigns

import dev.zwei.mailchimp.domain.mailChimp.apiObjects.Link

data class Campaigns(
    val _links: List<Link>?,
    val campaigns: List<Campaign>?,
    val total_items: Int?
)