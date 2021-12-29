package section_05

import kotlin.concurrent.thread

fun main(){
    var num = 0
    val lock = Any()
    for(i in 1..100) {
        thread {
            Thread.sleep(10)
            synchronized(lock) {
                println(Thread.currentThread())
                num += 1
            }

        }
    }
    Thread.sleep(5000)
    print(num)
}