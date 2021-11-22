package section_03

class NetflixUser {

    val userName : String

    constructor(email: String) {
        userName = email.substringBefore('@')
    }
    constructor(netflixId: Int) {
        userName = getId(netflixId)
    }
    private fun getId(id: Int) = "$id"
}

fun main() {
    val netflixUser = NetflixUser("behzod96@gmail.com")
    println(netflixUser.userName)
    val netflixId = NetflixUser(12000)
    println(netflixId.userName)
}