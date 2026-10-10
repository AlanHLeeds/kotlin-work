// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    var initialtemp = args[0].toFloat()
    val maxtemp = args[1].toFloat()
    val increment = args[2].toFloat()
    while (initialtemp < maxtemp) {
        val far = (initialtemp * 9 / 5) + 32
        println("%.2f°C = %.2f°F".format(initialtemp, far))
        initialtemp += increment
    }
}
