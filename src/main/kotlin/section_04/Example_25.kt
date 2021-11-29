package section_04

// An example of 'run' scope function
// Used when the object lambda contains
// both initialization and the computation of the return value.
fun main() {
    var company: Company? = null

    company?.run { print(companyName) }

    // Re-initialize company
    company = Company().apply {
        companyName = "Tesla"
        founderName = "Elon Musk"
    }
    company?.run {
        println(companyName)
    }


}