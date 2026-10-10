// Task 4.7: finding the longest line in a file
import kotlin.io.path.*

fun main(args: Array<String>) {
    var longestline = ""
    var linenum = 0
    var maxline = 0
    val filepath = Path(args[0])
    filepath.forEachLine {
        linenum = linenum + 1
        if (it.length > longestline.length) {
            longestline = it
            maxline = linenum
        }
    }
    println("The longest line is: $longestline")
    println(maxline)

}