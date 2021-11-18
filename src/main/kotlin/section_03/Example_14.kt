package section_03

// Solution of Zoo

fun main() {
    val input = readLine()!!

    val x = input.count { it == 'Z' || it == 'z' }
    val y = input.count { it == 'O' || it == 'o' }

    //https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/is-zoo-f6f309e7
    if (2 * x == y) {
        println("Yes")
    } else {
        println("No")
    }
}