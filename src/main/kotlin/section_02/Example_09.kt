package section_02

fun <T> Collection<T>.joinToWithExtension(
    separator: String = ",",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for((index,element) in this.withIndex()) {
        if(index>0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun main() {
    val listInt = listOf("Kotlin","Swift","Flutter")
    println(listInt.joinToWithExtension(",","(",")"))
}