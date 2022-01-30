package dev.zwei.mailchimp.domain.mailChimp.apiObjects.members

data class EcommerceData(
    val currency_code: String?,
    val number_of_orders: Int?,
    val total_revenue: Int?
)