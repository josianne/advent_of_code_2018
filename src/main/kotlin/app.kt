package xyz

fun main(args: Array<String>) {
    println("====== Day One ======")

    val day01 = loadData("/part_1.txt")
    println("Part one: " + DayOne.calculatePartOne(data = day01))
    println("Part two: " + DayOne.calculatePartTwo(data = day01))
}