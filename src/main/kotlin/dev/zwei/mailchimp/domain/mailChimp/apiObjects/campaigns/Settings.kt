package dev.zwei.mailchimp.domain.mailChimp.apiObjects.campaigns

data class Settings(
    val authenticate: Boolean?,
    val auto_fb_post: List<String>?,
    val auto_footer: Boolean?,
    val auto_tweet: Boolean?,
    val drag_and_drop: Boolean?,
    val fb_comments: Boolean?,
    val folder_id: String?,
    val from_name: String?,
    val inline_css: Boolean?,
    val preview_text: String?,
    val reply_to: String?,
    val subject_line: String?,
    val template_id: Int?,
    val timewarp: Boolean?,
    val title: String?,
    val to_name: String?,
    val use_conversation: Boolean?
)