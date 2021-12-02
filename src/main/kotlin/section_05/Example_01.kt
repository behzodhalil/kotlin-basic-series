package section_05

fun main() {
    fun strLenSafe(s: String?) = s?.length

    // strLenSafe(null)
    strLenSafe(null)
    var text: String? = null
    // text = "String"
    // The text may be null
    text?.uppercase()
    println(text)
}