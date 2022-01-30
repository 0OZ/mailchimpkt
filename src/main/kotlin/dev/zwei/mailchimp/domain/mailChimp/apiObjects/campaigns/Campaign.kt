package dev.zwei.mailchimp.domain.mailChimp.apiObjects.campaigns

import dev.zwei.mailchimp.domain.mailChimp.apiObjects.Link

data class Campaign(
    val _links: List<Link>?,
    val ab_split_opts: AbSplitOpts?,
    val archive_url: String?,
    val content_type: String?,
    val create_time: String?,
    val delivery_status: DeliveryStatus?,
    val emails_sent: Int?,
    val id: String?,
    val long_archive_url: String?,
    val needs_block_refresh: Boolean?,
    val parent_campaign_id: String?,
    val recipients: Recipients?,
    val report_summary: ReportSummary?,
    val resendable: Boolean?,
    val rss_opts: RssOpts?,
    val send_time: String?,
    val settings: Settings?,
    val social_card: SocialCard?,
    val status: String?,
    val tracking: Tracking?,
    val type: String?,
    val variate_settings: VariateSettings?,
    val web_id: Int?
)