// Task 5.4.1: main program
fun main() {
    val str1 = "This ing."
    val str2 = "This is a very long string that exceeds the limit of twenty characters."
    
    println("Is str1 too long? ${str1.isTooLong}")
    println("Is str2 too long? ${str2.isTooLong}")
}