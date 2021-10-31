package section_03

// This class is open: other class can inherit from it.
open class RichButton: Clickable {
    // This function is final: you can't override it in a subclass.
    fun disable() {}
    // This function is open: you may override it in a subclass.
    open fun doOperation() {}
    // This function overrides an open function and is open as well.
    final override fun click() {
        println("RichButton clicked")
    }
}