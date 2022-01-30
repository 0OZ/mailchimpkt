package dev.zwei.mailchimp.domain

import dev.zwei.mailchimp.clients.*
import dev.zwei.mailchimp.configuration.MailChimpConfig
import dev.zwei.mailchimp.domain.mailChimp.apiObjects.members.Member
import dev.zwei.mailchimp.domain.mailChimp.members.*
import dev.zwei.mailchimp.domain.mailChimp.apiObjects.members.Members
import dev.zwei.mailchimp.domain.mailChimp.apiObjects.members.TagsRequest
import dev.zwei.mailchimp.domain.mailChimp.apiObjects.members.UpdateTag
import dev.zwei.mailchimp.domain.mailChimp.apiObjects.mergeFields.MergeField
import dev.zwei.mailchimp.domain.mailChimp.apiObjects.templates.Templates
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.runBlocking

/**
 * MailChimp marketing client
 */
class MailChimp(
    block: MailChimpConfig.() -> Unit,
) {
    private val config = MailChimpConfig.apply(block)
    private val mailChimpClient = MailChimpClientAsync(config)
    private val listId: String = MailChimpConfig.listId

    /**
     * Lists == Audiences!
     */
    fun lists(): dev.zwei.mailchimp.domain.mailChimp.apiObjects.lists.Lists = runBlocking { mailChimpClient.get("/lists") }

    fun automations(): dev.zwei.mailchimp.domain.mailChimp.apiObjects.automations.Automations = runBlocking { mailChimpClient.get("/automations") }
    fun campaigns(): dev.zwei.mailchimp.domain.mailChimp.apiObjects.campaigns.Campaigns = runBlocking { mailChimpClient.get("/campaigns") }
    fun listTemplates(): Templates = runBlocking { mailChimpClient.get("/templates") }

    fun addTag(tag: String): String? = runBlocking {
        val mergeField = MergeField(
            type = "url"
        )
        mailChimpClient.post("/lists/$listId/merge-fields", mergeField)
    }
}

class Audiences(block: MailChimpConfig.() -> Unit) {
    private val config = MailChimpConfig.apply(block)
    private val listId: String = MailChimpConfig.listId
    private val mailChimpClient = MailChimpClientAsync(config)

    private suspend fun getMember(email: String): Member = coroutineScope {
        mailChimpClient.get("/lists/$listId/members/${email.lowercase().toMD5()}")
    }

    fun allMembers(): Members = runBlocking { mailChimpClient.get("/lists/$listId/members") }

    fun addMember(newMember: AddMember): Member? = runBlocking {
        mailChimpClient.post("/lists/$listId/members", newMember)
    }

    fun setTags(email: String, tags: List<String>): String? = runBlocking {
        val md5mail = email.lowercase().toMD5()
        val member = getMember(email)
        val newTags = (tags + (member.tags?.map { it.name }).orEmpty()).map {
            it?.let { UpdateTag(it) }
        }

        mailChimpClient.post("/lists/$listId/members/$md5mail/tags", TagsRequest(newTags))
    }

    fun updateMember(mail: String, member: UpdateMember): UpdateMember = runBlocking {
        val md5mail = mail.lowercase().toMD5()
        mailChimpClient.put("/lists/$listId/members/$md5mail", member)
    }

    fun removeMember(email: String) = runBlocking {
        mailChimpClient.delete("/lists/$listId/members", email)
    }
}