package section_04

// An example of 'also' function
// It is used where we have to perform additional operations
// when we have initialized the object members

fun main() {
    val listInt = mutableListOf(1, 2, 3, 4)
    println("Before using also function: $listInt")
    listInt.also {
        it.add(5) // Adding element '5' our list
        println("After using also and add function: $it")
        it.removeAt(2) // Removing element '3' in our list
    }
    print("Final version our list: $listInt")

}