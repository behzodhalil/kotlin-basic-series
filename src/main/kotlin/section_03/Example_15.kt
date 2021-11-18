package section_03

import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val scanner = Scanner(System.`in`)
    val testCount = scanner.nextInt()
    var costBalloonGreen: Int
    var costBalloonPurple: Int
    var participants: Int
    var finalCostGreen: Int
    var finalCostPurple: Int
    val minimumCost: ArrayList<Int> = ArrayList()
    val finalCost = Array(2) { 0 }
    val sumBalloons = ByteArray(2)
    for (count in 1..testCount) {
        costBalloonGreen = scanner.nextInt()
        costBalloonPurple = scanner.nextInt()
        participants = scanner.nextInt()
        val arrayTest = Array(2) { Array(participants) { 0 } }
        for (j in 0 until participants) {
            for (k in 0 until 2) {
                arrayTest[k][j] = scanner.nextInt()
            }
        }
        for (j in 0 until 2) {
            for (k in 0 until participants) {
                if (arrayTest[j][k] == 1) {
                    sumBalloons[j]++
                }
            }
        }
        finalCostGreen = sumBalloons[0] * costBalloonGreen
        finalCostPurple = sumBalloons[1] * costBalloonPurple
        finalCost[0] = finalCostGreen + finalCostPurple
        finalCostGreen = sumBalloons[1] * costBalloonGreen
        finalCostPurple = sumBalloons[0] * costBalloonPurple
        finalCost[1] = finalCostGreen + finalCostPurple
        if (finalCost[0] < finalCost[1]) {
            minimumCost.add(finalCost[0])
        } else {
            minimumCost.add(finalCost[1])
        }
        sumBalloons[0] = 0
        sumBalloons[1] = 0
    }
    minimumCost.forEach {
        println(it)
    }
}