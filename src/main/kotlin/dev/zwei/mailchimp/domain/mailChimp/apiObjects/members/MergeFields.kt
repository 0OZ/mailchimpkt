package dev.zwei.mailchimp.domain.mailChimp.apiObjects.members

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class MergeFields(val property1: Any? = null, val property2: Any? = null)