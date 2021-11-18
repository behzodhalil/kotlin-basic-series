package section_03

class Book(val name: String, val pages: Int) {
    override fun toString(): String {
        return "Book: book = $name, pages = $pages"
    }

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Book)
            return false
        return name == other.name && pages == other.pages
    }
}

fun main() {
    val book1 = Book("Habit", 365)
    val book2 = Book("Habit", 365)

    println(book1 == book2)
}