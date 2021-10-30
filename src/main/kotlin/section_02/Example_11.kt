package section_02

// Declares an extension property
val String.lastChar: Char
get() = get(length -1)

fun main() {
    println("Kotlin".lastChar)
}