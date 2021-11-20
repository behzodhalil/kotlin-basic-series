package section_03

class ClientWithHashCode(val name: String) {
    override fun toString(): String {
        return name
    }

}

fun main() {
    val client = ClientWithHashCode("Behzod")
    println(client)
}