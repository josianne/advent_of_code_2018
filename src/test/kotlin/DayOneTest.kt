package test.kotlin

import junit.framework.Assert.assertEquals
import org.junit.Test
import xyz.DayOne

class DayOneTest {
    @Test
    fun testPositive() {
        assertEquals(3, DayOne.calculatePartOne(data = listOf("+1", "+1", "+1")))
    }

    @Test
    fun testZero() {
        assertEquals(0, DayOne.calculatePartOne(data = listOf("+1", "+1", "-2")))
    }

    @Test
    fun testNegative() {
        assertEquals(-6, DayOne.calculatePartOne(data = listOf("-1", "-2", "-3")))
    }
}