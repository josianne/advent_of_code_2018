package xyz

fun main(args: Array<String>) {
    val inputs = loadData("/part_1-1.txt")

    println(DayOne.calculatePartOne(data = inputs))
}