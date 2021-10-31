package section_02

fun parsePathTest(path: String) {
    // toRegex:
    // Converts the string into a regular expression
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if(matchResult!=null) {
        val (directory,filename,extension) = matchResult.destructured
        println("Directory: $directory, Filename: $filename, Extension: $extension")
    }
}

fun main() {
    parsePathTest("/User/doc/kotlin-series/chapter.doc")
}