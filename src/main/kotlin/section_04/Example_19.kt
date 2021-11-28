package section_04

fun main() {
    println(alphabet())
}
/*
fun alphabet(): String {
    val result = StringBuilder()
    for (letter in 'A'..'Z') {
        result.append("|$letter")
    }
    result.append("\nNow I know the alphabet")
    return result.toString()
}*/
// Refactoring the 'with' function
fun alphabet(): String {
    val stringBuilder = StringBuilder()
    // Specifies the receiver value on
    // which you're calling the methods
    return with(stringBuilder){
        for (letter in 'A'..'Z'){
        // Calls a method on the receiver value
        // though an explicit this
            this.append("|$letter")
        }
        append("\nNow I know the alphabet")
        this.toString()
    }
}