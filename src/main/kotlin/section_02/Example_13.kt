package section_02

// This example shows that the spread operator
// lets you combine the values from an array
// and some fixed values in a single call.

fun main(args: Array<String>) {
    val list = listOf("args:", *args)
    println(list)
}