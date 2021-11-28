package section_04

fun main() {
    val people = listOf(
        PersonWithGroupBy("Behzod", 25),
        PersonWithGroupBy("Adam", 31),
        PersonWithGroupBy("Alice", 25)
    )
    // Avoids the creation of intermediate temporary objects
    println(people.asSequence()
        // To output a name only
        .map{print("People mapping: ($it)"); it.name}
        // To show names starting with 'A' only
        .filter { println("filter ($it)"); it.startsWith("A") }
        // Show them as a list
        .toList()
    )
    listOf(1,2,3,4).asSequence()
        .map { print("map($it)"); it*it }
        .filter { println("filter($it)"); it % 2== 0 }
        .toList()

    println(people.map(PersonWithGroupBy::name).filter { it.startsWith('A') })
    println(people.map { p -> p.name }.filter { it.startsWith('B') })
    // Kotlin compiler doesn't create 'it' keyword twice,
    // if we use two lambda expression at the time.

}