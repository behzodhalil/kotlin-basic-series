package section_01

fun main(args: Array<String>) {

    // string templates:
    // You declare a variable name and then use it in the following string literal.
    // Like many scripting languages, Kotlin allows you to refer to local variables in string literals
    // by putting the $ character in front of the variable name.

    // isNotEmpty():
    // Returns true if the array has element

    val name = if (args.isNotEmpty()) args[0] else "Kotlin"
    println("Hello $name")

    // ${} syntax:
    // ${} syntax for using to declare more complex expressions

    val array = arrayOf("Kotlin", "Swift")
    // [Kotlin, Swift]

    if (array.isNotEmpty()) println("Bye ${array[0]}")

    // [0] = "Kotlin"
    // [1] = "Swift"

    println("Hello, again! Elements of array is ${if (array.isNotEmpty()) array.size else "Task is finished!"}")

}