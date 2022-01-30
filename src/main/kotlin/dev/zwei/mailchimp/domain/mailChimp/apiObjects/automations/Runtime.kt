package dev.zwei.mailchimp.domain.mailChimp.apiObjects.automations

data class Runtime(
    val days: List<String>?,
    val hours: dev.zwei.mailchimp.domain.mailChimp.apiObjects.automations.Hours?
)