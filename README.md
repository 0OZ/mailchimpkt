# MailChimp Client


unoffical and unfinished 


---


```kotlin

object MailChimpTags {
    const val new: String = "new"
    const val verified = "verified"
}

// init
private val audiences = Audiences {
    apiKey = System.getenv("MAILCHIMP_KEY")
    listId = System.getenv("MAILCHIMP_LIST_ID")
    useDefaultDataCenter()
}

//tag to email
fun foo(email: String) = try {
    audiences.setTags(email, listOf(MailChimpTags.verified))
} catch (e: Exception) {
    logger.error(e.message ?: "something goes wrong!")
}

    
```
