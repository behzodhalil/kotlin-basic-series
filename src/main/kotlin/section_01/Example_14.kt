package section_01

import java.lang.Exception

enum class Books {
    CLASSICAL,
    FANTASY,
    ACTION,
    ADVENTURE,
    HORROR
}

fun compareBooks(b1: Books, b2: Books) =
    when {
        (b1 == Books.ACTION && b2 == Books.ADVENTURE) -> println("I prefer to read 'Adventure' books")
        (b1 == Books.FANTASY && b2 == Books.HORROR) -> println("I prefer to read 'Fantasy' books")
        (b1 == Books.CLASSICAL && b2 == Books.FANTASY) -> println("I prefer to read 'Classical' books")
        else -> throw Exception("Unknown")
}

fun main() {
    compareBooks(Books.ACTION,Books.ADVENTURE)
}