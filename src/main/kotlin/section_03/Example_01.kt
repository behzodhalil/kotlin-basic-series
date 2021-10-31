package section_03

interface Clickable {
    // This declares an interface with a single abstract method named click.
    fun click()
}

class Button : Clickable {
    override fun click() {
        println("Button clicked")
    }
}
fun main() {
    Button().click()
}