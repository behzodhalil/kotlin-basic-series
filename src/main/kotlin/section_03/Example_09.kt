package section_03

import section_01.evalTest

sealed class Expr {
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()

}

fun evalWithSealed(e: Expr): Int =
    when (e) {
        is Expr.Num -> e.value
        is Expr.Sum -> evalWithSealed(e.left) + evalWithSealed(e.right)
    }

fun main() {
    println(evalWithSealed(Expr.Sum(Expr.Sum(Expr.Num(10),Expr.Num(20)),Expr.Num(20))))
}

