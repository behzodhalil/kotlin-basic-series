package section_01

fun main() {

    // type inference:
    // Kotlin compiler can automatically identify the data type of the variable.
    // The ability of the compiler to determine types from context is called type inference


    // var:
    // The var keyword is mutable reference.
    // The value of such a variable can be changed(or reassign).

    var number = 7
    var string = "Behzod"
    var float = 2.155
    var character = 'a'
    var double = 2.1

    println("$number + $string + $float + $character + $double")
}