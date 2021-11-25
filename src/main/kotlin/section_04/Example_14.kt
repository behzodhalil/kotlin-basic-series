package section_04

// Using the right function for the job: 'count' and 'size'

fun main() {
    val people = listOf(Person("John", 12), Person("Jeff", 25), Person("Bob", 24))
    print("${people
        .filter { it.age > 12 }
        .size}"
    )
}

