package section_01

// In this example, if the condition is satisfied,
// the program behaves correctly, and the percentage variable is initialized with number.
// Otherwise, an exception is thrown and the variable isn't initialized.

fun main() {
    var number = -1
    val percentage =
        if (number in 0..100) number
        else throw IllegalArgumentException(
            "A percentage value must be between 0 and 100: $number"
        )
    println(percentage)
}