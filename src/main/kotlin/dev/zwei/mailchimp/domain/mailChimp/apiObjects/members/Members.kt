package dev.zwei.mailchimp.domain.mailChimp.apiObjects.members

import dev.zwei.mailchimp.domain.mailChimp.apiObjects.Link

data class Members(
    val members: List<Member>,
    val list_id: String,
    val total_items: Int,
    val _links: List<Link>?
)
