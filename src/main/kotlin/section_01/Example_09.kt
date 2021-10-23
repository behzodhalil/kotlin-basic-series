package section_01

import java.util.*

    // fun:
    // The function declaration starts with the fun keyword.
    // The return type comes after the parameter list,
    // separated from it by a colon.

fun createRandomRectangle(): Rectangle {

    // Random:
    // An abstract class that is implemented
    // by random number generator algorithms

    // nextInt():
    // Gets the next random Int from
    // the random number generator in the specified range

    val random = Random()
    return Rectangle(random.nextInt(),random.nextInt())
}

fun display() {
    println(createRandomRectangle().isSquare)
    println(createRandomRectangle().height)
    println(createRandomRectangle().width)
}

fun main() {
    display()
}