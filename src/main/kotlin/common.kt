package xyz

fun loadData(filename: String) =
    DayOne::class.java.getResource(filename)
        .readText()
        .lines()
        .filter(String::isNotBlank)