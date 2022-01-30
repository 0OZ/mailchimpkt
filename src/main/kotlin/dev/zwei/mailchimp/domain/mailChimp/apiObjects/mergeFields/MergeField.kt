package dev.zwei.mailchimp.domain.mailChimp.apiObjects.mergeFields

data class MergeField(
    val default_value: String? = null,
    val display_order: Int? = null,
    val help_text: String? = null,
    val name: String? = null,
    val options: Options? = null,
    val `public`: Boolean? = null,
    val required: Boolean? = null,
    val tag: String? = null,
    val type: String? = null
)