package com.mateuyabar.aoc.twenty

import com.mateuyabar.aoc.util.AocExercice
import com.mateuyabar.aoc.util.AocSolution
import com.mateuyabar.aoc.util.splitByAnySpace


private val exercice = AocExercice(
    year = 2020,
    day = 4,
    level = 2   ,
    sampleOutput = "4",
    sampleInput = """eyr:1972 cid:100
hcl:#18171d ecl:amb hgt:170 pid:186cm iyr:2018 byr:1926

iyr:2019
hcl:#602927 eyr:1967 hgt:170cm
ecl:grn pid:012533040 byr:1946

hcl:dab227 iyr:2012
ecl:brn hgt:182cm pid:021572410 eyr:2020 byr:1992 cid:277

hgt:59cm ecl:zzz
eyr:2038 hcl:74454a iyr:2023
pid:3556412378 byr:2007

pid:087499704 hgt:74in ecl:grn iyr:2012 eyr:2030 byr:1980
hcl:#623a2f

eyr:2029 ecl:blu cid:129 byr:1989
iyr:2014 pid:896056539 hcl:#a97842 hgt:165cm

hcl:#888785
hgt:164cm byr:2001 iyr:2015 cid:88
pid:545766238 ecl:hzl
eyr:2022

iyr:2010 hgt:158cm hcl:#b6652a ecl:blu byr:1944 eyr:2021 pid:093154719""",
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
            val hasAllFields = requiredKeys.filter { passport.contains(it + ":") }.size == requiredKeys.size
            hasAllFields && areValidFields(passport)
        }
        return passports.toString()
    }

    private fun areValidFields(passport: String): Boolean =
        passport.splitByAnySpace().all{
            val (key, value) = it.split(":")
            when(key){
                "byr" -> value.length==4 && value.toInt() in 1920..2002
                "iyr" ->value.length==4 && value.toInt() in 2010..2020
                "eyr" ->value.length==4 && value.toInt() in 2020..2030
                "hgt" -> if(value.endsWith("cm"))
                    value.substring(0, value.length-2).toInt() in 150..193
                else if(value.endsWith("in"))
                    value.substring(0, value.length-2).toInt() in 59..76
                else false
                "hcl" -> value.matches("#[0-9,a-f]{6}".toRegex())
                "ecl" ->value in listOf("amb","blu","brn","gry","grn","hzl","oth")
                "pid" -> value.matches("[0-9]{9}".toRegex())
                "cid"-> true
                else -> false
            }.also { println("$key:$value $it") }
        }

}
