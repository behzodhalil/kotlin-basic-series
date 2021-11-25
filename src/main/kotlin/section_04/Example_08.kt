package section_04


class Ref<T>(var value: T)

fun main() {
    var counter = 0
    val inc = { counter++ }
    println(inc.toString())
}
