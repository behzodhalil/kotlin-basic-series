package section_03

// This example about cooperating functions

fun main() {
    functionA(1)
}

fun functionA(case: Int) {
    when(case) {
        // Here, functionA will do the taskA1 and
        // give control to the functionB to execute the taskB1.
        1 -> {
            taskA1()
            functionB(1)
        }
        2 -> {
            taskA2()
            functionB(2)
        }
        3 -> {
            taskA3()
            functionB(3)
        }
        4 -> {
            taskA4()
            functionB(4)
        }
    }
}
fun functionB(case: Int) {
    when(case) {
        1 -> {
            taskB1()
            functionA(2)
        }
        2 -> {
            taskB2()
            functionA(3)
        }
        3 -> {
            taskB3()
            functionA(4)
        }
        4 -> {
            taskB4()

        }
    }

}
fun taskA1() {println("Task A1")}
fun taskA2() {println("Task A2")}
fun taskA3() {println("Task A3")}
fun taskA4() {println("Task A4")}
fun taskB1() {println("Task B1")}
fun taskB2() {println("Task B2")}
fun taskB3() {println("Task B3")}
fun taskB4() {println("Task B4")}