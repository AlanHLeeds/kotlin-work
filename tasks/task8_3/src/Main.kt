// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    val data = fetchData(args)
    val lowest = data.minBy { it.second }
    val highest = data.maxBy { it.second }
    println(lowest)
    println(highest)
}


