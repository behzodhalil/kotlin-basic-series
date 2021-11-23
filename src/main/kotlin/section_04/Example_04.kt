package section_04

fun main() {
    val sum = { x: Int, y: Int -> x + y }
    val min = { x: Int, y: Int -> if (x < y) x else y }
    val max = { x: Int, y: Int -> if (x > y) x else y }
    val lengthString = { a: String, b: String -> if (a.length > b.length) a else b }

    println(sum(10, 20))
    println(max(47, 30))
    println(min(27, 30))
    println(lengthString("Behzod", "Jurabek"))
}