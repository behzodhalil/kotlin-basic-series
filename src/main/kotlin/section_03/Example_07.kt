package section_03

// An example of abstract class
// This class is abstract class
// You can not create instance of abstract class

abstract class Animal {
    // This function is abstract
    // It doesn't have an implementation
    // It must be overridden in subclasses.
    abstract fun eat()

    // Non-abstract functions in abstract classes
    // aren't open by default but can be marked as open.
    open fun stop() {}
    fun hunt() {}
}