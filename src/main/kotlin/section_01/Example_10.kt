package section_01

data class Item(var item: String, val status: Status) {
    var itemResult: Any = when(status) {
        Status.SUCCESS -> println("Success -> $item")
        Status.ERROR -> println("Error -> $item")
        Status.FAIL -> println("Fail -> $item")
        Status.LOADING -> println("Loading -> $item")
    }
}
    // enum:
    // Enums are a way to describe a set of predefined constants.
    // To create an enum class, we write enum class rather than just class.
    // Inside the body of the class, the options are called enum entries.
    // Sometimes we call them enum constants instead.

enum class Status {
    SUCCESS,
    ERROR,
    FAIL,
    LOADING,
}
// This enum class with constructor parameter
enum class ColorMode (val item: Int) {
    // with constructor arguments
    LIGHT(50),
    DARK(50)
}

fun main() {
    val item = Item("Kotlin",Status.SUCCESS)
    // output:
    // Success -> Kotlin
    println(item)
    // Item(item=Kotlin, status=SUCCESS)
}