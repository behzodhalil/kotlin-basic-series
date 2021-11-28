package section_04


data class Person(
    val name: String,
    val age: Int
)

fun findTheOldest(people: List<Person>) {
    var maxAge = 0
    var theOldest: Person? = null
    for (person in people) {
        if (person.age > maxAge) {
            maxAge = person.age
            theOldest = person
        }

    }
    println(theOldest)
}


fun main() {
    val people = listOf(Person("Behzod", 25), Person("Bob", 31))
    println(people.maxByOrNull { it.age })
    println(people.minByOrNull { it.age })

}