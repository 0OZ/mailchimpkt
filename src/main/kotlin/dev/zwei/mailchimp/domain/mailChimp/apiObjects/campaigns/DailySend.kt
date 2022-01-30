package dev.zwei.mailchimp.domain.mailChimp.apiObjects.campaigns

data class DailySend(
    val friday: Boolean?,
    val monday: Boolean?,
    val saturday: Boolean?,
    val sunday: Boolean?,
    val thursday: Boolean?,
    val tuesday: Boolean?,
    val wednesday: Boolean?
)