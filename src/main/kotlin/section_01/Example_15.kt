package section_01


// Expr interface:
// Expr interface doesn't declare any methods
// It's used as a marker interface to provide a commpon type
// for different kinds of expressions.

interface Expr
class Num(val value: Int): Expr
class Sum(val left: Expr, val right: Expr): Expr


fun main() {

}