package section_04

// An example of 'apply' function
// It can be used to operate on members of the receiver object
// mostly to initialize members.
fun main() {
    val company = Company()
    company.apply {
        this.companyName = "Tesla"
        this.founderName = "Elon Musk"
    }
    println("${company.companyName}, also ${company.founderName}")
}