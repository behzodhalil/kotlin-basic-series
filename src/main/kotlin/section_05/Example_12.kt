package section_05

import java.util.*

data class FullName(
    val name: String,
    val fullName: String
)

fun main() {
    val names: SortedSet<FullName> = TreeSet()
    val person = FullName("Behzod","Bozorboev Behzod")

    names.add(person)
    names.add(FullName("Abdurahmon","Usarov"))
    names.add(FullName("Jurabek","Muminov"))

    println(person in names)

}