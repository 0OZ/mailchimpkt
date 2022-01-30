package dev.zwei.mailchimp.domain.mailChimp.apiObjects.members

data class LastNote(
    val created_at: String?,
    val created_by: String?,
    val note: String?,
    val note_id: Int?
)