package section_03

interface UserWithProperty {
    // This means classes implementing the User interface
    // need to provide a way to obtain the value of nickname.
    val nickName: String
}


// primary constructor property
class PrivateUser(override val nickName: String) : UserWithProperty

// custom getter
class SubscribingUser(private val email: String) : UserWithProperty {
    override val nickName: String
        get() = email.substringBefore('@')
}

// property initializer
class FacebookUser(private val accountId: Int) : UserWithProperty {
    override val nickName: String = getFacebookName(accountId)
}

fun getFacebookName(accountId: Int): String {
    return "$accountId"
}

fun main() {
    println(PrivateUser("test@kotlinlang.org").nickName)
    println(SubscribingUser("test@kotlinlang.org").nickName)
}
