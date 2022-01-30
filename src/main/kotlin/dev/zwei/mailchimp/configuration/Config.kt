package dev.zwei.mailchimp.configuration


object MandrillConfig {
    lateinit var apiKey: String
}

object MailChimpConfig {
    lateinit var apiKey: String
    lateinit var listId: String

    /**
     * is optional it is contains in api key
     */
    lateinit var dataCenter: String

    fun useDefaultDataCenter() {
        dataCenter = apiKey.replace(Regex(".*?-(.*)"), "$1")
    }
}