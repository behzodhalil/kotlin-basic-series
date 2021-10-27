package section_01

fun compareAndPrint(e: Any) {
    if(e is Int) {
        println("The expression is $e")
    }
    if(e is String){
        println("The expression is $e")
    }
    if(e is Float) {
        println("The expression is $e")
    }
}
fun main() {
    compareAndPrint("String")
}