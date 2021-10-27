package section_01

interface ExprTest
class NumberTest(val value: Int) : ExprTest
class SumTest(val left: ExprTest, val right: ExprTest) : ExprTest

fun evalTest(e: ExprTest): Int =
    when (e) {
        is NumberTest ->
            e.value
        is SumTest ->
            evalTest(e.right) + evalTest(e.left)
        else ->
            throw IllegalArgumentException("Unknown Exception")
    }

fun main() {
    println(evalTest(SumTest(SumTest(NumberTest(2), NumberTest(10)), NumberTest(10))))
}