package section_03

class Paper
class Water
internal fun compareWithObject(type: Any?) {
    if(type is Paper) println("true")
    else println("false")
}
fun main() {
    val paper = Paper()
    val water = Water()

    compareWithObject(paper)
    compareWithObject(water)
}