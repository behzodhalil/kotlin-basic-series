package section_03


class UserWithBackingField(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println(
                """
                Address was changed for $name:
                "$field" -> "$value"
            """.trimIndent()
            )
            field = value
        }
}

fun main() {
    val user = UserWithBackingField("Alice")
    user.address = "Seoul"
}
