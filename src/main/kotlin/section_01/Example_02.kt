package section_01

fun main() {
    val numberOneForMax = 10
    val numberTwoForMax = 15

    val numberOneForMin = 15
    val numberTwoForMin= 12

    val resultMax = max(numberOneForMax, numberTwoForMax)
    val resultMin = min(numberOneForMin,numberTwoForMin)

    println("$resultMax \n $resultMin")
}

fun max(n1: Int, n2: Int) {
    if (n1 > n2) println("$n1 is bigger than $n2")
    else println("$n1 is smaller than $n2")
}

fun min(n1: Int, n2: Int) {
    if (n1<n2) println("$n1 is smaller than $n2")
    else println("$n1 is bigger than $n2")
}

