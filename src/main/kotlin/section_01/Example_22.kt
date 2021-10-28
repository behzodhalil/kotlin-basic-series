package section_01

// Fizz-Buzz game

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "Fizz Buzz"
    i % 3 == 0 -> "Fizz"
    i % 5 == 0 -> "Fizz Buzz"
    else -> "$i"
}
fun main() {
    for(i in 1..100) {
        println(fizzBuzz(i))
    }
}