// Task 8.5: example of using a higher-order function

fun main() {
    // Add your testing code here
    val text = "Hello, World!"
    val vowelCount = text.howMany { it in "aeiouAEIOU" }
    println("Number of vowels in '$text': $vowelCount")
}
