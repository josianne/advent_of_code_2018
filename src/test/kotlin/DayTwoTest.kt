package test.kotlin

import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Assert.assertThat
import org.junit.Test
import xyz.DayTwo

class DayTwoTest {
    @Test
    fun testPartOne() {
        val input = listOf("abcdef", "bababc", "abbcde", "abcccd", "aabcdd", "abcdee", "ababab")

        assertEquals(12, DayTwo.calculatePartOne(data = input))
    }

    @Test
    fun testPartTwo() {
        val input = listOf("abcde", "fghij", "klmno", "pqrst", "fguij", "axcye", "wvxyz")

        assertEquals("fgij", DayTwo.calculatePartTwo(data = input))
    }

    @Test
    fun testHammingDistanceEqual() {
        assertEquals(0, DayTwo.hammingDistance(stringOne = "value", stringTwo = "value"))
        assertEquals(0, DayTwo.hammingDistance(stringOne = "test", stringTwo = "test"))
    }

    @Test
    fun testHammingDistanceBlankValue() {
        assertEquals(null, DayTwo.hammingDistance(stringOne = "value", stringTwo = ""))
        assertEquals(null, DayTwo.hammingDistance(stringOne = "", stringTwo = "value"))

        assertEquals(null, DayTwo.hammingDistance(stringOne = "test", stringTwo = ""))
        assertEquals(null, DayTwo.hammingDistance(stringOne = "", stringTwo = "test"))
    }

    @Test
    fun testHammingDistanceDifferent() {
        assertEquals(2, DayTwo.hammingDistance(stringOne = "santa", stringTwo = "panda"))
        assertEquals(4, DayTwo.hammingDistance(stringOne = "abcd", stringTwo = "efgh"))
        assertEquals(1, DayTwo.hammingDistance(stringOne = "sleep", stringTwo = "sheep"))
    }
}