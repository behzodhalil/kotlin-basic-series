package section_04

class Vehicle {
    var name: String? = null
    var size: Int = 10
}
fun Vehicle.performOperation(): String{
    name?.let {
        name = "String"
    } ?: return "Null"
    return "$name"
}
fun main() {
    val v = Vehicle()
    v.performOperation()
}