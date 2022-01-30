package dev.zwei.mailchimp.domain.mailChimp.apiObjects.members

data class Stats(
    val avg_click_rate: Int?,
    val avg_open_rate: Int?,
    val ecommerce_data: EcommerceData?
)