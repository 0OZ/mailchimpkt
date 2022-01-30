package dev.zwei.mailchimp.domain.mailChimp.apiObjects.campaigns

data class RssOpts(
    val constrain_rss_img: Boolean?,
    val feed_url: String?,
    val frequency: String?,
    val last_sent: String?,
    val schedule: Schedule?
)