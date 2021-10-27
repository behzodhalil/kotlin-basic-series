package section_01

interface ExprLogging
class NumberLogging(val value: Int): ExprLogging
class SumLogging(val left: ExprLogging, val right: ExprLogging): ExprLogging

fun evalWithLogging(e: ExprLogging): Int =
    when(e) {
        is NumberLogging -> {
            println("number is: ${e.value}")
            e.value
        }
        is SumLogging -> {
            // evalWithLogging(e.left) + evalWithLogging(e.right)
            val left = evalWithLogging(e.left)
            val right = evalWithLogging(e.right)
            println("sum is: $left + $right")
            left + right
        }
        else -> {
            throw IllegalArgumentException("Unknown Exception")
        }
    }

fun main() {
    println(evalWithLogging(SumLogging(SumLogging(NumberLogging(10),NumberLogging(10)),NumberLogging(20))))
}