package section_01

// class:
// The class is a blueprint for the objects
// which have common properties

class Person(var name: String)

fun main() {
    // object:
    // To create an object instance of class,
    // create a val called object and initialize it as an instance of class

    val person = Person("Kotlin")
    // Before changing of the name:
    println(person.name)

    person.name = "Swift"
    // After changing of the name:
    println(person.name)
}
