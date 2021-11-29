package section_04

// An example of let function
// 'let' function is often used to provide null safety calls

fun main() {
    // Nullable variable a with value as null
    var number: Int? = null

    number?.let {
        println(it)
    }
    number = 5
    // It executes the block only with the non-null value
    number?.let {
        println(it)
    }
}