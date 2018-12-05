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
        val permutations = HashSet<String>()

        data.forEach { string ->
            string.forEachIndexed { index, _ ->
                if (!permutations.add(string.replaceRange(index, index + 1, "_"))) {
                    return string.removeRange(index, index + 1)
                }
            }
        }

        return ""
    }

    private fun Boolean.toInt() = if (this) 1 else 0
}
