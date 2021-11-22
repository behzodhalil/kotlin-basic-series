package section_03


abstract class House {
    abstract fun open()
    abstract fun close()
    abstract fun cook()
    abstract fun heat()
}

fun main() {
    val bigHouse = object : House() {
        override fun open() {
            TODO("Not yet implemented")
        }

        override fun close() {
            TODO("Not yet implemented")
        }

        override fun cook() {
            TODO("Not yet implemented")
        }

        override fun heat() {
            TODO("Not yet implemented")
        }

    }
}