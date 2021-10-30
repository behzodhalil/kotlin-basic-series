package section_02

// In this example, we were interested in how it works:
// why it's possible to do so many things
val strings: List<String> = listOf("Kotlin","Swift","Flutter")
val numbers: Collection<Int> = setOf(1,14,3)

fun main(){
    println("Strings: ${strings.last()}  + Max: ${numbers.maxOrNull()}")
    // Strings: Flutter  + Max: 14
}