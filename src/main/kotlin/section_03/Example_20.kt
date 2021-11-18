package section_03

class LengthCounter {
    var counter: Int = 0
        // You cannot change this property outside the class
        private set
    fun addWord(word: String) {
        counter += word.length
    }
}

fun main() {
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("Hi!")
    println(lengthCounter.counter)
}