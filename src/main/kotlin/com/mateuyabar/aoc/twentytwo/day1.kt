package com.mateuyabar.aoc.twentytwo

import com.mateuyabar.aoc.util.AocExercice
import com.mateuyabar.aoc.util.AocSample
import com.mateuyabar.aoc.util.AocSolution

private val exercise = AocExercice(
    year = 2022,
    day = 1,
    level = 1   ,
    samples = listOf(
        AocSample(output = "24000",
            input ="""1000
2000
3000

4000

5000
6000

7000
8000
9000

10000""")
    ),
)

fun main() {
    solution.run()
}

private val solution = object : AocSolution(exercise) {
    override fun calculate(input: String): String {
        return input.split("\n\n")
            .map{it.lines().map{it.toLong()}.sum()}
            .max().toString()
    }

}