package section_04


// the “let” operator provides an option to perform an operation on the current object
// and return any value based on the use case.

class PersonWithLet(
) {
    var name: String = "Abcd"
    var age: Int = 25

    fun displayInfo() {
        print("Name is $name \n; Age is $age")
    }
}

private fun performOperation() {
    val person = PersonWithLet().let {
        "The name of person is ${it.name}"
    }
    println(person)
}

private fun performOperation2() {
    val person = PersonWithLet().let {
        "The age of person is ${it.age}"
    }
    println(person)
}

private fun performOperation3() {
    val person = PersonWithLet().let {
        it.name = "NewName"
    }
    println(person)
}

private fun performOperation4() {
    val person = PersonWithLet().let { personWithLet ->
        personWithLet.name = "Name"
    }
    println(person)
}

private fun performOperation5() {
    val person = PersonWithLet().let { personWithLet ->
        personWithLet.name.let {
            "${it.length}"
        }
    }
    println(person)
}

fun main() {
    performOperation()
    performOperation2()
    performOperation3()
    performOperation5()
}
