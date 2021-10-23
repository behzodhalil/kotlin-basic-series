package section_01

enum class Color {
    RED,
    ORANGE,
    YELLOW,
    GREEN,
    BLACK,
    INDIGO
}
fun getMnemonic(color: Color) =
    when(color) {
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLACK -> "Battle"
        Color.INDIGO -> "In"
}

fun main(){
    println(getMnemonic(Color.YELLOW))
}