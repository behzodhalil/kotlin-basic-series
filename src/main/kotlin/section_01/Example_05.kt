package section_01

fun main() {

    // val:
    // Val reference is itself immutable and can't be changed
    // The object that it points to may be mutable

    val message = arrayListOf("Kotlin")

    // Mutates the object pointed to by the reference
    message.add("Swift")
    println(message)
}