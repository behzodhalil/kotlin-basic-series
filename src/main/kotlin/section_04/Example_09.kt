package section_04

class PersonWithMemberReference {
    private val age = 18
    fun getAge() : Int {
        return age
    }
}

fun main() {
    val getAge = PersonWithMemberReference::getAge
    val getAgeWithLambda = {p: PersonWithMemberReference -> p.getAge()}
    println(getAge)
    println(getAgeWithLambda)
}