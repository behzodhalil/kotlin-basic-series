package section_02

// In this example, we use 'extension function'
// An extension function is a simple thing.
// It's a function that can be called as a member of a class,
// but it defined outside it.

fun String.lastChar(): Char = this.get(this.length - 1)

fun main() {
    println("Kotlin".lastChar())
}

