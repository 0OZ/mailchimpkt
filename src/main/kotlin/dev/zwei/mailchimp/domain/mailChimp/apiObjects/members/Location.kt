package dev.zwei.mailchimp.domain.mailChimp.apiObjects.members

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class Location(
    val country_code: String?,
    val dstoff: Int?,
    val gmtoff: Int?,
    val latitude: Int?,
    val longitude: Int?,
    val timezone: String?
)