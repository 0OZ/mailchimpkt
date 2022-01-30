package dev.zwei.mailchimp.domain.mailChimp.apiObjects.automations

import dev.zwei.mailchimp.domain.mailChimp.apiObjects.Link
import com.fasterxml.jackson.annotation.JsonIgnoreProperties

data class Automations(
    val _links: List<Link>?,
    val automations: List<Automation>?,
    val total_items: Int?
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class Automation(
    val _links: List<Link>?,
    val create_time: String?,
    val emails_sent: Int?,
    val id: String?,
    val recipients: Recipients?,
    val report_summary: ReportSummary?,
    val settings: Settings?,
    val start_time: String?,
    val status: String?,
    val tracking: Tracking?,
    val trigger_settings: TriggerSettings?
)