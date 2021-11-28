package section_04

data class PersonWithGroupBy(
    val name: String,
    val age: Int
)

fun main() {
    val people = listOf(
        PersonWithGroupBy("Behzod",25),
        PersonWithGroupBy("John",31),
        PersonWithGroupBy("Alice",25)
    )
    val listString = listOf("a","b","a")
    // member reference
    println(listString.groupBy(String::first))
    // lambda expression
    println(listString.groupBy { it.first() })
    // This function helps to divide all element into
    // different groups according to some quality
    println(people.groupBy { it.age })
}