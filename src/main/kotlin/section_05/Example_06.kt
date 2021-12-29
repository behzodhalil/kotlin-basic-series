package section_05

var name: String = "Behzod"
var surname: String = "Bozorboev"

val fullName get() = "$name ${section_05.surname}"

fun main() {
    println(fullName)

    name = "Behzodbek"

    println(fullName)
}
