package section_02

data class Person(val id: Int, val name: String, val address: String)

fun Person.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if(value.isEmpty()){
            throw IllegalArgumentException(
                "Can't save ${id}: empty: $fieldName"
            )
        }
    }
    validate(name,"Name")
    validate(address,"Address")
}