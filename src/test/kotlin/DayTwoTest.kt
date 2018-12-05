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
}