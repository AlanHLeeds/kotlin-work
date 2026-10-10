// Task 5.3.2: rollDice() function
import kotlin.random.Random

fun rollDie(sides: Int = 6) : Int{
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        val result = Random.nextInt(1, sides + 1)
        return result
    }
    else {
        println("Error: cannot have a $sides-sided die")
        return 0
    }
}



fun rollDice(sides: Int=6, rolls: Int=1): Int {
    var total = 0
    for (i in 1..rolls) {
        total += rollDie(sides)
    }
    return total
}