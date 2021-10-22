package section_01

fun main() {

    // var:
    // The var keyword is mutable reference.
    // The value of such a variable can be changed(reassign).

    var numberOne = 10
    var numberTwo = 11

    // prints a result of max
    showResult(showMax(numberOne,numberTwo))
    // prints a result of min
    showResult(showMin(numberOne,numberTwo))
}

fun showMax(n1: Int, n2: Int): Int = if(n1>n2) n1 else n2
fun showMin(n1: Int, n2: Int): Int = if(n1<n2) n2 else n1
fun showResult(int: Int) { println(int)}