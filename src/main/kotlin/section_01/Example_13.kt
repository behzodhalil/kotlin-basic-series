package section_01

enum class Smartphones {
    SAMSUNG,
    LG,
    IPHONE,
    REDMI,
    XIOMI,
}

fun compare(s1: Smartphones, s2: Smartphones) =
    when (setOf(s1, s2)) {
        // setOf():
        // This function returns a new read only set of given elements.

        setOf(Smartphones.LG, Smartphones.REDMI), setOf(Smartphones.REDMI,Smartphones.LG) -> Smartphones.LG
        setOf(Smartphones.REDMI, Smartphones.XIOMI), setOf(Smartphones.XIOMI,Smartphones.REDMI) -> Smartphones.REDMI
        setOf(Smartphones.SAMSUNG, Smartphones.IPHONE) -> Smartphones.IPHONE
        else -> throw Exception("Unknown")
    }

fun main() {
    println(compare(Smartphones.SAMSUNG,Smartphones.IPHONE))
    println(compare(Smartphones.REDMI,Smartphones.XIOMI))
    println(compare(Smartphones.XIOMI,Smartphones.REDMI))
}