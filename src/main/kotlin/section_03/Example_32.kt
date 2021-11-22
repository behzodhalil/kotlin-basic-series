package section_03

class A {
    companion object {
        fun showString(text: String) {
            println("$text is called by a companion object")
        }
    }
    fun showString(text: String) {
        println("$text is called by an ordinary class")
    }
}

fun main() {
    // approach with an ordinary class
    val a = A()
    a.showString("John")
    // approach with a companion object
    // with companion object, we call directly methods without any instance of class
    A.showString("Behzod")
}