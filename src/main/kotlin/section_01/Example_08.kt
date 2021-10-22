package section_01

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width

    /*  full syntax
    get() {
            return height == width
      }
    */
}

class Square(val length: Int) {
    val result: Int
    get() = length * length

    /*  full syntax
    get() {
           return length*length
      }
    */
}