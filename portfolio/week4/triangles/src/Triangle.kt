// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt
import kotlin.system.exitProcess



class Triangle(val sideA: Double, val sideB: Double, val sideC:Double) {
    init {
        require((sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA))
    }
    val perimeter = (sideA + sideB + sideC)
    val semiPerimeter = ((sideA + sideB + sideC) / 2)
    val area = sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC))

    override fun toString(): String {
        return "Triangle($sideA, $sideB, $sideC)"
    }
}






