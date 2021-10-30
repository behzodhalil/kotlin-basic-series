package section_02

// By default,
// public final class View

// With 'open' keyword:
// public class View

open class View {
    open fun click() = println("View clicked")
}
class Button: View() {
    override fun click() {
        println("Button clicked")
    }
}

fun View.show() = println("View shows")
fun Button.show() = println("Button shows")

fun main() {
    val view: View = Button()
    view.click()
    view.show()
}