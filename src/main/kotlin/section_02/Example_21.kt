package section_02

data class UserTest(val id: Int, val name: String, val address: String)

fun saveTestUser(user: UserTest) {
    fun validate(
        user: UserTest,
        value: String,
        fieldName: String
    ) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user ${user.id}: empty $fieldName"
            )
        }
    }

    validate(user, user.name, "Name")
    validate(user, user.address, "Address")
}

fun main() {
    saveTestUser(UserTest(1, "", ""))
}