package xyz

import java.util.*

object DayOne {
    fun calculatePartOne(data: List<String>): Int = data.map(String::toInt).sum()

    fun calculatePartTwo(data: List<String>): Int {
        val integers = data.map(String::toInt)
        val visited = HashSet<Int>()

        var (sum, index) = listOf(0, 0)

        while (visited.add(sum)) { sum += integers[index++ % integers.size] }

        return sum
    }
}