package section_04

// the class specifies for saving data
data class Pilot(
    val name: String,
    val age: Int
)
// the object that specifies for using singleton pattern
internal object Compare {
    // the function that specifies what values should be compared to find minimum element.
    fun min(p1: Pilot,p2: Pilot): Pilot{
        return if(p1.age<p2.age) p1 else p2
    }
    // the function that specifies what values should be compared to find maximum element.
    fun max(p1: Pilot,p2: Pilot): Pilot {
        return if(p1.age>p2.age) p1 else p2
    }
}

fun main() {
    val pilots = listOf(Pilot("John",30),Pilot("Bob",32), Pilot("Sarah",36))
    val minAgePilots = pilots.reduce(Compare::min)
    val maxAgePilots = pilots.reduce(Compare::max)

    println(minAgePilots)
    println(maxAgePilots)
}