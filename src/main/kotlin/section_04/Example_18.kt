package section_04

fun main() {
    val list = listOf("Bob","Sara","John").asSequence()
        .filter{it.length>3}
        .map{it.toString()}
        .toList()
    println(list)
}