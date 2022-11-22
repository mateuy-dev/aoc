package com.mateuyabar.aoc.twenty

import com.mateuyabar.aoc.util.AocExercice
import com.mateuyabar.aoc.util.AocSolution




private val exercice = AocExercice(
    year = 2020,
    day = 4,
    level = 1,
    sampleOutput = "2",
    sampleInput = """ecl:gry pid:860033327 eyr:2020 hcl:#fffffd
byr:1937 iyr:2017 cid:147 hgt:183cm

iyr:2013 ecl:amb cid:350 eyr:2023 pid:028048884
hcl:#cfa07d byr:1929

hcl:#ae17e1 iyr:2013
eyr:2024
ecl:brn pid:760753108 byr:1931
hgt:179cm

hcl:#cfa07d eyr:2025 pid:166559648
iyr:2011 ecl:brn hgt:59in""",
)

fun main() {
    solution.run()
}

private val solution = object : AocSolution(exercice) {
    override fun calculate(input: String): String {

        val requiredKeys = listOf(
            "byr",
            "iyr",
            "eyr",
            "hgt",
            "hcl",
            "ecl",
            "pid"
        )


        val passports = input.split("\n\n").count { passport ->
             requiredKeys.filter { passport.contains(it + ":") }.size == requiredKeys.size
        }
        return passports.toString()
    }

}
