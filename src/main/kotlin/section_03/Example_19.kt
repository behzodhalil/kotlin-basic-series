package section_03


class UserWithBackingField(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            // reads the backing field value
            println(
                """
                Address was changed for $name:
                "$field" -> "$value"
            """.trimIndent()
            )
            // updates the backing field value
            field = value
        }
}

fun main() {
    val user = UserWithBackingField("Alice")
    // You change a property value as usual by saying
    // user.address = "new value", which invokes a setter under the hood.
    user.address = "Seoul"
}
