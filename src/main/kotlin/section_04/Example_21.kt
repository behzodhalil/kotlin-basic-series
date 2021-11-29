package section_04

// Example without scope functions
class Company {
    lateinit var companyName: String
    lateinit var founderName: String
}

fun main() {
    // Without using scope functions

    // Creating an instance of Company class
    // company object is a context object
    val company = Company()

    company.companyName = "Tesla"
    company.founderName = "Elon Musk"

    println("${company.companyName} and ${company.founderName}")

}