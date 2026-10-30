// Task 12.1: program that uses a Point object

fun main() {
    val p = Point(x=1.0, y=1.5)
    println(p.x)
    println(p.y)
    val origin = p.distance()
    println(origin)
    val x = Point(x=4.5, y=7.0)
    val distance = p.distanceTo(x)
    println(distance)

}