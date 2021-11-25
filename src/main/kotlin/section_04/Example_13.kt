package section_04

fun main() {
    val canBeInClub27 = { p: Person -> p.age <= 27 }
    val canBeInClub26 = { p: Person -> p.age <= 25 }
    val people = listOf(Person("Alice", 26), Person("Bob", 31))
    val people2 = listOf(Person("Alice", 25), Person("Bob", 25))
    println(people.all(canBeInClub27))
    // If our data is entered conditionally,
    // Returns true if all items are less than 25,
    // otherwise returns false
    println(people2.all(canBeInClub26))
    println(!people2.all(canBeInClub26))
    println(people.any(canBeInClub27))


    println("----------------")
    val list = listOf(1,2,3)
    // The first check ensure that not all elements are equal to 3
    println(!list.all { it == 3 })
    // That's the same as having at least one non-3,
    // which is what you check using any
    println(list.any { it !=3 })
}