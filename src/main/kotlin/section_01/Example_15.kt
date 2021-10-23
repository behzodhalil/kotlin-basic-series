package section_01

import com.sun.org.apache.xpath.internal.XPathAPI.eval

// Expr interface:
// Expr interface doesn't declare any methods
// It's used as a marker interface to provide a commpon type
// for different kinds of expressions.

interface Expr
class Num(val value: Int): Expr
class Sum(val left: Expr, val right: Expr): Expr


fun main() {

}