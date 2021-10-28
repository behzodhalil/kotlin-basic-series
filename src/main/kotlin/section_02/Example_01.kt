package section_02

fun main() {
    val set = hashSetOf(1,7,53)
    val list = arrayListOf(1,8,53)
    val map = hashMapOf(1 to "one",2 to "two",3 to "three")

    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)
}