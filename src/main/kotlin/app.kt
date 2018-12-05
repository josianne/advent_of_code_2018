package xyz

fun main(args: Array<String>) {
    println("====== Day One ======")

    val day01 = loadData("/day_01.txt")
    println("Part one: " + DayOne.calculatePartOne(data = day01))
    println("Part two: " + DayOne.calculatePartTwo(data = day01))

    println("\n====== Day Two ======")

    val day02 = loadData("/day_02.txt")
    println("Part one: " + DayTwo.calculatePartOne(data = day02))
    println("Part two: " + DayTwo.calculatePartTwo(data = day02))
}