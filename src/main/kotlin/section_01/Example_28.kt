package section_01


fun recognize(c: Char) = when(c) {
    in 'a'..'z' -> "It's a character"
    in '0'..'9' -> "It's a digit"
    else -> "I don't know"
}

fun main() {
    println(recognize('r'))
}