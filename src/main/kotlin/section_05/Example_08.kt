package section_05

var nameExample: String = "Example 08"

val fullNameExample: String?
        get() = nameExample?.let { "${it.length}" }

fun main() {
    println(fullNameExample)
}
val listExample : MutableList<String> = mutableListOf()