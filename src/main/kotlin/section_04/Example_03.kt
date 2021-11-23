package section_04

data class Book(
    val name: String,
    val page: Int
)

fun main() {
    val books = listOf(
        Book("Kotlin in Action", 600),
        Book("Clean code", 760)
    )
    // member reference
    println(books.maxByOrNull(Book::page))
    // lambda expressions
    println(books.maxByOrNull { it.page })
    println(books.maxByOrNull { b: Book -> b.page })

    val namesOfBooks =
        books.joinToString(separator = ",", prefix = "[", postfix = "]", transform = { b: Book -> b.name })
    println(namesOfBooks)
}