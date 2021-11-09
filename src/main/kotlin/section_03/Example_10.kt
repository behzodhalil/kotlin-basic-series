package section_03


// This block of code  surrounded by parentheses
// is called a primary constructor.
class User(val nickName: String)

// The constructor keyword begins the declaration
// of a primary or secondary constructor.
class UserWithConstructor constructor(val _nickName: String) {
    val nickName: String

    // The init keyword introduces an initializer block
    init {
        nickName = _nickName
    }
}

class SnapchatUser(val nickName: String,val isSubscribed: Boolean = true)

fun main() {
    val userSnapchat = SnapchatUser("John")
    println(userSnapchat.nickName)
    println(userSnapchat.isSubscribed)
}