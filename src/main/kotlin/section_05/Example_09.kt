package section_05

// Example of a variance
data class Course(val name: String)

class OddList<T>(val list: List<T>) {
    fun oddItems(): List<T> {
        return list.filterIndexed { index, _ -> index % 2 == 1 }
    }
}

fun main() {
    val listOfStrings = listOf("Kotlin","Java","C#")
    val resultOfStrings: OddList<String> = OddList(listOfStrings)
    println(resultOfStrings.oddItems())

    val listOfInts = listOf(1,2,3)
    val resultOfInts: OddList<Int> = OddList(listOfInts)
    println(resultOfInts.oddItems())
}