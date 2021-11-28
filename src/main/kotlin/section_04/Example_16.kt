package section_04

class BookWithFlatMap(
    val title: String,
    val author: List<String>
)

fun main() {
    val list = listOf("Bob", "John", "Alice")
    val books = listOf(
        BookWithFlatMap("Habit", listOf("Bob", "Sara", "John"))
    )
    println("The book author of size are: " +
            "${books.flatMap { it.author }.toSet().size}"
    )
    println(list.map { it.uppercase() })
    println(list.map { s: String ->
        s.lowercase()
    })
    println(list.flatMap { it.toList() })
}