package xyz

object DayTwo {
    fun calculatePartOne(data: List<String>): Int {
        val multiples = data.fold(listOf(0, 0)) { acc, string ->
            val charCounts = string.groupingBy { it }.eachCount().values
            listOf(acc[0] + charCounts.contains(2).toInt(), acc[1] + charCounts.contains(3).toInt())
        }

        return multiples[0] * multiples[1]
    }

    fun calculatePartTwo(data: List<String>): String {
        data.forEachIndexed { index, currentWord ->
            data.subList(index, data.size).forEach { comparedWord ->
                if (hammingDistance(stringOne = currentWord, stringTwo = comparedWord) == 1)
                    return currentWord.filterIndexed { index, c -> c == comparedWord[index] }
            }
        }

        return ""
    }

    fun hammingDistance(stringOne: CharSequence, stringTwo: CharSequence): Int? {
        if (stringOne == stringTwo) return 0
        if (stringOne.length != stringTwo.length) return null

        return stringOne.zip(stringTwo).sumBy { (it.first != it.second).toInt() }
    }

    private fun Boolean.toInt() = if (this) 1 else 0
}
