// Task 12.3.2: demo of Person class with secondary constructor
import kotlinx.datetime.LocalDate


fun main() {
    val date = LocalDate(1997, 8, 23)
    val p = Person("Joe", date)
    println(p.name)
    println(p.birth)
}