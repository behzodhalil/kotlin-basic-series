package section_01

enum class Seasons{
    SPRING,
    SUMMER,
    AUTUMN,
    WINTER
}

fun getSeason(seasons: Seasons) =
    when(seasons) {
        Seasons.SPRING, Seasons.SUMMER -> println("warm and hot")
        Seasons.AUTUMN -> println("cold")
        Seasons.WINTER -> println("too cold")
}

fun main() {
    getSeason(Seasons.SPRING)
    getSeason(Seasons.SUMMER)
}