// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Implement main program here
    try {
        
        if (args.isEmpty()) {
            throw IllegalArgumentException("No filename provided")
            exitProcess(1)
        }
        if (args.size > 1) {
            throw IllegalArgumentException("Too many arguments provided")
            exitProcess(1)
        }

        if (!args[0].endsWith(".txt")) {
            throw IllegalArgumentException("Invalid file type. Please provide a .txt file")
            exitProcess(1)
        }
        
        val list = readData(args[0])
        val varValue = variance(list)
        println("Variance: $varValue")
    } 
    catch (e: Exception) {
        println("Error: ${e.message}")
        exitProcess(1)
    }
}
