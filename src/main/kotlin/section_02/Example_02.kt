package section_02

// An example for immutable list
fun main() {
    // A list is a collection of items with a specific order.
    val list = listOf(1,2,3,4,5,6)
    val listLanguages = listOf("English","Korean","Russian","Uzbek","Polish")

    for(item in listLanguages){
        println(item)
    }

    println(list.last())
    // Output: 6
    println(list[3])
    println(list.get(3))
    // Output: 4
}