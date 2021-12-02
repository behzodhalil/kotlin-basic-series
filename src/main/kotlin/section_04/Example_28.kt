package section_04

// Kotlin allows you to invoke
// scope functions on Nullable types without safe call ?
// The reason is inside an extension function for a nullable type
// 'this' can be null

fun main() {
    val name: String? = null
    "Kotlin".printStringLength()
    name.printStringLength()


}

fun String?.printStringLength(): Unit {
    this?.let {
        println("$it has ${it.length} characters")
    } ?: println("Null")
    // ?: safe call
}

val <T> List<T>.lastIndex: Int get() = size - 1
