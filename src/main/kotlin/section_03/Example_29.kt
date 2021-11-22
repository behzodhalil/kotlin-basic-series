package section_03


class CountingSet<T>(private val innerSet: MutableCollection<T> = HashSet<T>()) : MutableCollection<T> by innerSet {

    var objectsAdded = 0

    override fun add(element: T): Boolean {
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        objectsAdded += elements.size
        return innerSet.addAll(elements)
    }

    fun printResult()  = println("$objectsAdded")
}

fun main() {
    val cSet = CountingSet<Int>()
    cSet.addAll(listOf(1,1,2))
    cSet.printResult()
}