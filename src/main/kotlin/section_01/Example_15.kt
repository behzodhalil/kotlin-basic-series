package section_01


// Expr interface:
// Expr interface doesn't declare any methods
// It's used as a marker interface to provide a commpon type
// for different kinds of expressions.

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int {
    // is:
    // You can check whether a variable is of a certain type
    // by using an 'is' check.

    if(e is Num){
        val number = e as Num
        return number.value
    }
    if(e is Sum) {
        // The variable e is smart cast.
        return eval(e.left) + eval(e.right)
    }
    throw IllegalArgumentException("Unknown expression")
}

fun main() {
    println(eval(Sum(Sum(Num(1),Num(2)),Num(4))))
    // Expression is (1+2)+4
    // Output is 7
}