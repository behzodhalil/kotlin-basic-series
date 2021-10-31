package section_02

fun parsePath(parse: String) {
    val directory = parse.substringBeforeLast("/")
    val fullName = parse.substringAfterLast("/")

    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")

    println("\n Directory: $directory;\n FileName: $fileName;\n Extension: $extension;")
}

fun main() {
    parsePath("/User/doc/kotlin-series/chapter.doc")
}