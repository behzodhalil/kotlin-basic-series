package section_05

class Employee(val name: String, val manager: Employee?)

fun managerName(employee: Employee): String? = employee.manager?.name

fun main() {
    val ceo = Employee("Da boss", null)
    val developer = Employee("Bob Smith", ceo)
    print(managerName(developer))
}