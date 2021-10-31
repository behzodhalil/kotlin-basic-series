package section_02

// A function with repetitive code

data class User(val name: String, val id: Int, val address: String)

fun saveUser(user: User) {
    if(user.name.isEmpty()) {
        throw IllegalArgumentException(
            "Can't save user ${user.id}: empty name"
        )
    }
    if(user.address.isEmpty()) {
        throw IllegalArgumentException (
            "Can't save user ${user.id}: empty address"
                )
    }
}
fun main() {
    saveUser(User("",1,""))
}