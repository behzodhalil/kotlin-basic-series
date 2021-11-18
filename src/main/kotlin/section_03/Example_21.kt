package section_03

class Client(val nameClient: String, val postalCode: Int) {
    override fun toString() = "Client (name = $nameClient, postalCode = $postalCode)"
}

fun main() {
    val client = Client("Behzod",1000)
    println(client.nameClient)
    println(client.postalCode.toString())
    println(client)
}