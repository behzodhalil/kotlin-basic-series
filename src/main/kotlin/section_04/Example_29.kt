package section_04

// This example of an extension function

fun main() {
    "Kotlin".showText()
    // Kotlin is a receiver object or variable
    // We reference via 'this' keyword to a receiver object.

}
fun String.showText(): Unit {
    println(this)
}
