package dev.zwei.mailchimp.domain.mailChimp.apiObjects.automations

data class TriggerSettings(
    val runtime: dev.zwei.mailchimp.domain.mailChimp.apiObjects.automations.Runtime?,
    val workflow_emails_count: Int?,
    val workflow_title: String?,
    val workflow_type: String?
)