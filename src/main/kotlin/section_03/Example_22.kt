package section_03

class Chair(private val color: String, private val size: String, private val brand: String) {
    override fun toString(): String {
        return "Chair: \n color = $color;\n size = $size, \n brand = $brand"
    }
}

fun main() {
    val chair = Chair("black","big","Samsung")
    println(chair)
}