package section_03

object Constant {
    const val API_KEY = "http://google.com"

}

object Payroll {
    private val allEmployees = listOf("Behzod", "Xurshid", "Muhammadali")

    fun calculateSalary() {
        for (person in allEmployees) {
            println(person)
        }
    }
}

fun main() {
    println(Constant.API_KEY.toString())
    Payroll.calculateSalary()
}