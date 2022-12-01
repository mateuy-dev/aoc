package com.mateuyabar.aoc.twentytwo

import com.mateuyabar.aoc.util.AocExercice
import com.mateuyabar.aoc.util.AocSample
import com.mateuyabar.aoc.util.AocSolution
import com.mateuyabar.aoc.util.ShouldNotOccurExeption

private val exercise = AocExercice(
    year = 2022,
    day = 2,
    level = 1   ,
    samples = listOf(
        AocSample(output = "XXX",
            input ="""XXX""")
    ),
)

fun main() {
    solution.run()
}

private val solution = object : AocSolution(exercise) {
    override fun calculate(input: String): String {
        TODO()
        return input
    }

}