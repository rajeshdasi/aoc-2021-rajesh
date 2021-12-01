fun main() {
    fun part1(input: List<String>): Int {
        return input.size
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    fun findMaxReadingsPartA(data: List<Int>): Int {
        var maxCount = 0
        var index = 1
        while (index < data.size) {
            if (data[index] > data[index - 1]) {
                maxCount++
            }
            index++
        }
        return maxCount
    }

    fun findMaxReadingPartB(data: List<Int>): Int {
        val windowed: List<Int> = data.windowed(3, 1, true) { it.sum() }
        return findMaxReadingsPartA(windowed)
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 1)

    val input = readInput("Day01")
    val resultOfPartA = findMaxReadingsPartA(input.map { it.toInt() })
    val resultOfPartB = findMaxReadingPartB(input.map { it.toInt() })
    println(part1(input))
    println(part2(input))
    println(resultOfPartA)
    println(resultOfPartB)
}


