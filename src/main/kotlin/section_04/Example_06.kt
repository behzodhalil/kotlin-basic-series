package section_04

fun printMessageWithPrefix(message: Collection<String>, prefix: String) {
    // Takes as an argument a lambda specifying what to do with each element
    message.forEach {
        println("$prefix $it")
    }
}

fun main() {
    val errors = listOf("403 Forbidden", "404 Not Found")
    printMessageWithPrefix(errors, "Error::")
    val sum = { x: Int, y: Int ->
        println("Computing the sum of $x and $y")
        // lambda expression computes the result and returns it automatically
        x + y
    }
    println(sum(13, 25))
}