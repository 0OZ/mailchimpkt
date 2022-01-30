package dev.zwei.mailchimp.domain.mailChimp.apiObjects.campaigns

data class Ecommerce(
    val total_orders: Int?,
    val total_revenue: Int?,
    val total_spent: Int?
)