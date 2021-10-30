package section_02

fun <T> joinToString (
    collection: Collection<T>,
    separator: String,
    prefix: String,
    postFix: String
): String {

    // StringBuilder:
    // StringBuilder class can be used
    // when you want to modify a string without creating a new object
    val result = StringBuilder(prefix)

    // withIndex():
    // Returns the index of element and the element itself
    for((index, element) in collection.withIndex()) {
        if(index>0) result.append(separator)
        result.append(element)
    }

    // After the loop execution statement completes
    // It will be run
    result.append(postFix)
    return result.toString()
}

fun main() {
    val list = listOf(1,2,3)
    println(joinToString(list,";","(",")"))

}