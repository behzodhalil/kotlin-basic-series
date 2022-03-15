package section_05

data class UserWithExample14(
    val name: String,
    val surname: String
)

fun main() {
    var userWithExample14 = UserWithExample14("Behzod","Bozorboev")
    userWithExample14 = userWithExample14.copy(surname = "Halilov")
    println(userWithExample14)
    userWithExample14 = userWithExample14.copy(name = "Sulaymon")
    print(userWithExample14)
}