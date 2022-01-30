package dev.zwei.mailchimp.domain.mailChimp.apiObjects.mergeFields

data class Options(
    val choices: List<Any>? = null,
    val date_format: String? = null,
    val default_country: Int? = null,
    val phone_format: String? = null,
    val size: Int? = null
)