package section_01

fun main() {
    // Object declared an array with sizes 1 to 10
    var listInt = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // repeat:
    // Repeat function helps to use loop.
    // This function repeats 10 times.
    repeat(10) {
        val randomInt = listInt.random()
        println(randomInt)
        // This statement helps remove element from the array.
        listInt = listInt - randomInt
    }

}