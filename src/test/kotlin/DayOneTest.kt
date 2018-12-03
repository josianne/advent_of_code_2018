package test.kotlin

import org.junit.Assert.assertEquals
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

    // Part Two

    @Test
    fun testOne() {
        assertEquals(0, DayOne.calculatePartTwo(data = listOf("+1", "-1")))
    }

    @Test
    fun testTwo() {
        assertEquals(10, DayOne.calculatePartTwo(data = listOf("+3", "+3", "+4", "-2", "-4")))
    }

    @Test
    fun testThree() {
        assertEquals(5, DayOne.calculatePartTwo(data = listOf("-6", "+3", "+8", "+5", "-6")))
    }

    @Test
    fun testFour() {
        assertEquals(14, DayOne.calculatePartTwo(data = listOf("+7", "+7", "-2", "-7", "-4")))
    }
}