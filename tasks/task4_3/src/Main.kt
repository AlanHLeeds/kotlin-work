// Task 4.3: grade calculation using a when expression
fun main() {
    println("Enter your first grade 0-100:")
    val grade1 = readln().toInt()
    println("Enter your second grade 0-100:")
    val grade2 = readln().toInt()
    println("Enter your third grade 0-100:")
    val grade3 = readln().toInt()
    var avg = (grade1 + grade2 + grade3) / 3
    when (avg) {
        in 70..100 -> println("distinction")
        in 40..69 -> println("pass")
        in 0..39 -> println("fail")
        else -> println("invalid grade")
    }
    println(avg)

}