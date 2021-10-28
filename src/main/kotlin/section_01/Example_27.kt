package section_01

// Transforms to a<=c && c<=z
// Transforms to 1<=d && d<=100
fun isLetter(c: Char) = c in 'a'..'z' || c in 'A' .. 'Z'
fun isDigit(d: Int) = d in 1..100 || d in 100..1000

fun main() {
    println(isLetter('w'))
    println(isDigit(1000))
}