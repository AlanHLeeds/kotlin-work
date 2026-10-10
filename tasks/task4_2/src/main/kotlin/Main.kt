// Task 4.2: use of if and ranges

fun main() {
    println("choose: a, b, c, d")
    val choice = readln().lowercase()
    if ((choice.length != 1) || (choice[0] !in ('a'..'d'))) {
        println("Invalid choice")
    } else {
        println("Order accepted")
    }
}
