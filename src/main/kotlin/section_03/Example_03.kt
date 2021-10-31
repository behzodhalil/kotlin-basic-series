package section_03

interface Focusable {
    fun click()
    fun setFocus(value: Boolean)
}

class ButtonFocusable : Focusable {
    override fun click() {
        println("Focus clicked")
    }

    override fun setFocus(value: Boolean) {
        println("I got $value")
    }

}

fun main() {
    val button = ButtonFocusable()
    button.click()
    button.setFocus(true)
}