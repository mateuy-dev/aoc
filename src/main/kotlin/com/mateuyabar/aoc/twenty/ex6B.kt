package com.mateuyabar.aoc.twenty

import com.mateuyabar.aoc.util.AocExercice
import com.mateuyabar.aoc.util.AocSample
import com.mateuyabar.aoc.util.AocSolution
import com.mateuyabar.aoc.util.splitByAnySpace


private val exercise = AocExercice(
    year = 2020,
    day = 6,
    level = 2,
    samples = listOf(
        AocSample(output = "6",
            input ="""abc

a
b
c

ab
ac

a
a
a
a

b""")
    ),
)

fun main() {
    solution.run()
}

private val solution = object : AocSolution(exercise) {
    override fun calculate(input: String): String {
        val data = input.split("\n\n").map { it.lines().map { it.toSet() } }
        return data.sumOf{ countQuestions(it)}.toString()
    }

    private fun countQuestions(it: List<Set<Char>>) =it.reduce{s1, s2 -> s1.intersect(s2)}.count()

}
