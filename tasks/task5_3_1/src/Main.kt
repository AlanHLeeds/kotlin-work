// Task 5.1.2: main program
fun main(args: Array<String>) {
    if (args.isEmpty()) {
        rollDie()
    }
    else {
        val rolls = args[0].toInt()
        rollDie(rolls)
    }
    
}