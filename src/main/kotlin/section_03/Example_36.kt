package section_03

// declares an empty companion object
data class MicroUser(val firstName: String, val lastName: String) {
    companion object {

    }
}
// declares an extension function
fun MicroUser.Companion.fromJson(json: String,json2: String): MicroUser {
    return MicroUser(json,json2)
}

// start point all Kotlin programs
fun main() {
    val micro = MicroUser.fromJson("String","String")
    println(micro)
}