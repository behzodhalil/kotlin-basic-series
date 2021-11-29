package section_04

fun main() {
    // let function
    var number : Int? = null
    number?.let {
        println("List value is null")
    }
    number = 10
    number?.let {
        println("Let function: Number value is $it")
    }
    // apply function
    val company = Company()
    company.apply {
        this.founderName = "Elon Musk"
        this.companyName = "Tesla"
    }
    println("Apply function: ${company.companyName}: ${company.founderName}")

    // with function
    with(company) {
        this.companyName = "Samsung"
        this.founderName = "Undefined"
    }
    println("With function: ${company.companyName}: ${company.founderName}")

    // also function
    company.also {
        it.companyName = "Apple"
        it.founderName = "Steve Jobs"
    }
    println("Also function: ${company.companyName}: ${company.founderName}")
}