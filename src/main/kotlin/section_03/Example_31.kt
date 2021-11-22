package section_03

data class PersonWithObject(val name: String) {
    object NameComparator : Comparator<PersonWithObject> {
        override fun compare(o1: PersonWithObject, o2: PersonWithObject): Int =
           o1.name.compareTo(o2.name)
    }
}
fun main() {
    val listPeople = listOf(PersonWithObject("Alice"), PersonWithObject("Bob"))
    println(listPeople.sortedWith(PersonWithObject.NameComparator))
    println(listPeople.toString())


}