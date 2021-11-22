package section_03

data class UserWithCopy(val name: String, val age: Int)

fun main() {
    val behzod = UserWithCopy("Behzod",25)
    // 'copy' method
    // - The method helps to modify properties of class
    // - Kotlin compiler generates these methods
    //   if we mark our class by data.
    println(behzod.copy(age = 24))

}