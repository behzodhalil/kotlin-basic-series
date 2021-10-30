package section_02

// Declares a top-level property
var count = 0

fun increase() {
    // count++
    // count = 0 -> count = 1 (when you call again)
    count++
}

fun main() {
    println(increase())
    println("$count")
}