package section_03

// This an example of delegation
class Vehicle{
    fun print() {
        println("This is a delegate")
    }
}
class Car{
    private val vehicle = Vehicle()
    fun printCar() {
        vehicle.print()
    }
}

fun main() {
    val car = Car()
    car.printCar()
}
