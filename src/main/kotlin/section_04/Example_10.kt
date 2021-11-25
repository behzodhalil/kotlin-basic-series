package section_04

data class PersonForCollection(
    val name: String,
    val age: Int
)
fun main() {
    val list = listOf(1,2,3,4)
    val persons = listOf(
        PersonForCollection("Bob",32),
        PersonForCollection("John",25),
        PersonForCollection("Ali",36),
        PersonForCollection("Sara",22)
    )
    println(persons.filter { it.age > 30 })
    println(list.filter { it%2 == 0 })

}