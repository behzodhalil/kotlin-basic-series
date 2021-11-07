package section_03

// An example of lambda expression

fun main() {
    val display: (String, Int)->String = {name,age -> "Hello! My name is $name and my age is $age"}

    println(display("Behzod",25))
}