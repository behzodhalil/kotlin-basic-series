package section_01

fun main(args: Array<String>) {

    // string templates:

    val name = if(args.isNotEmpty()) args[0] else "Kotlin"

    println("Hello $name")

}