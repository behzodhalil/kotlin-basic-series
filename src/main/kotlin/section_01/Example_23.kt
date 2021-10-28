package section_01

fun fizzBuzzTest(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz"
    i % 3 == 0 -> "Fizz"
    i % 5 == 0 -> "Buzz"
    else -> "$i"
}

fun main() {
    /*for(i in 100 downTo 1 step 2){
        println(fizzBuzzTest(i))
    }*/

    for(i in 50 downTo 1 step 5){
        println(fizzBuzzTest(i))
    }
}
