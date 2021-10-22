package section_01

fun main() {

    // val:
    // The val keyword is constant variable.
    // The val keyword can not be assigned multiple times.


    // We can initialize 'val' with different values depending on some condition
    // If the compiler can ensure that only initialization statements will be executed

    val message: String
    val isRun = true

    if (isRun) {
        message = "Success"
        println(message)
    } else {
        message = "Failed"
        println(message)
    }
}