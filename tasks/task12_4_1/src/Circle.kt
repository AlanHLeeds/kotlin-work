// Task 12.4.1: Circle class
import kotlin.math.PI

class Circle(val centre: Point, val radius: Double) {
    init{
        require(radius>0)

    }

    fun area(): Double {
        return (PI * this.radius * this.radius)
    }

    fun perimeter(): Double {
        return (2 * PI * this.radius)
    }

    fun contains(p: Point): Boolean {
        return (centre.distanceTo(this.centre) <= radius)
    }

}