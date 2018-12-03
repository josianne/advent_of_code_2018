package xyz

object DayOne {
    fun calculatePartOne(data: List<String>): Int = data.map(String::toInt).sum()
}