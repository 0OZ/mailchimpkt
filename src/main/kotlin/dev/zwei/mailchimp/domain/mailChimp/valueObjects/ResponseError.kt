package dev.zwei.mailchimp.domain.mailChimp.valueObjects

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class ResponseError(
    val detail: String? = null,
    val instance: String? = null,
    val status: Int? = null,
    val title: String? = null,
    val type: String? = null
)