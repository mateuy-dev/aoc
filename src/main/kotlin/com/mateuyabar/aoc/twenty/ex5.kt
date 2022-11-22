package com.mateuyabar.aoc.twenty

import com.mateuyabar.aoc.util.AocExercice
import com.mateuyabar.aoc.util.AocSample
import com.mateuyabar.aoc.util.AocSolution
import com.mateuyabar.aoc.util.splitByAnySpace


private val exercice = AocExercice(
    year = 2020,
    day = 5,
    level = 1,
    samples = listOf(
        AocSample("BFFFBBFRRR", "567"),
        AocSample("FFFBBBFRRR", "119"),
        AocSample("BBFFBBFRLL", "820")
    ),
)

fun main() {
    solution.run()
}

private val solution = object : AocSolution(exercice) {
    override fun calculate(input: String): String {
        return input.lines().maxOf { calculateId(it) }.toString()
    }

    private fun calculateId(number: String) :Long{
        val row = number.substring(0, 7).replace("F", "0").replace("B", "1").toLong(2)
        val col = number.substring(7).replace("L", "0").replace("R", "1").toLong(2)
        println("$number: $row $col")
        return row*8 + col
    }
}
