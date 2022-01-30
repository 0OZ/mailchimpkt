package dev.zwei.mailchimp.domain.mailChimp.apiObjects.lists

data class Contact(
    val address1: String?,
    val address2: String?,
    val city: String?,
    val company: String?,
    val country: String?,
    val phone: String?,
    val state: String?,
    val zip: String?
)