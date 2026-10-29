// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    "Median with list of size 1" {
        median(listOf(5f)) shouldBe 5f
    }

    "Median with list of size 2" {
        median(listOf(5f, 10f)) shouldBe 7.5f
    }

    "Median with list of size 3" {
        median(listOf(5f, 10f, 15f)) shouldBe 10f
    }

    "Median with list of size 4" {
        median(listOf(5f, 9f, 11f, 15f)) shouldBe 10f
    }

    // Write four more tests here
})
