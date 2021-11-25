package section_04

// This example about the 'map' function
data class PersonForMapping(
    val name: String,
    val age: Int
)

fun main() {
    val list = listOf(1, 2, 3, 4)
    val people = listOf(
        PersonForMapping("Bob", 32),
        PersonForMapping("John", 25),
        PersonForMapping("Ali", 36),
        PersonForMapping("Sara", 22)
    )
    println(people.map { it.name })
    println(people.map(PersonForMapping::age))
    println(people
        .filter { it.age > 30 }
        .map { it.name })
    // You can find the maximum age of the people in the group
    // and return everyone who is that age
    println(people.filter{it.age == people.maxByOrNull(PersonForMapping::age)?.age})
    println(list.map { it * it })
    println(list.map { it + it })
}