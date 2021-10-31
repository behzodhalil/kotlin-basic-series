package section_02

data class UserTest2(val id: Int, val name: String, val address: String)

fun saveUserTest2(userTest2: UserTest2) {
    fun validate(value: String, fieldName: String) {
        if(value.isEmpty()){
            throw IllegalArgumentException(
                "Can't save ${userTest2.id}: empty $fieldName"
            )
        }
    }
    validate(userTest2.name,"Name")
    validate(userTest2.address,"Address")
}

fun main() {
    saveUserTest2(UserTest2(1,"",""))
}