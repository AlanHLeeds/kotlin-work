// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    var sum = 0
    for (i in 1..args[0].toInt()){
        if (i % 2 != 0) {
            sum += i
        }
    }
    println(sum)
}
