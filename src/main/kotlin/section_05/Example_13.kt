package section_05

class User(
    val name: String,
    val surname: String
) {
    fun withSurname(surname: String) = User(name,surname)
}

fun main() {
    var user = User("Maja","Markiewicz")
    println("${user.name} + ${user.surname}")
    user = user.withSurname("Moskala")
    println("${user.name} + ${user.surname}")
}