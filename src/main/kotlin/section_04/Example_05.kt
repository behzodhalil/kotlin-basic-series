package section_04

data class Computer(
    val name: String,
    val type: String,
    val createTime: Int
)

fun main() {
    val computers = listOf(
        Computer("Samsung", "Notebook", 2020),
        Computer("LG", "Notebook", 2012),
        Computer("Dell", "Notebook", 2015)
    )

    println(computers.maxByOrNull { c: Computer -> c.createTime })
    println(computers.maxByOrNull { it.createTime })
    println(computers.maxByOrNull { c -> c.createTime })
}