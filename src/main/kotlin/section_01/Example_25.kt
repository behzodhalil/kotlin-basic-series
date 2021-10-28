package section_01

import java.util.*

fun main() {

    val binaryReps = TreeMap<Char,String>()

    // Iterates over the character from A to F using a range of characters.
    for(c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        // Stores the value in map by the c key
        // Instead of calling get and put, you can use map[key] to read values
        // and map[key] = value to set them
        // Java version: binaryReps.put(c,binary)
        binaryReps[c] = binary
    }
    // letter receives the key
    // binary receives the value
    for((letter,binary) in binaryReps) {
        println("$letter = $binary")
    }
}