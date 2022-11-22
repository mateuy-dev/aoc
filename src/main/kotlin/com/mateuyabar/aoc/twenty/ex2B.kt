package com.mateuyabar.aoc.twenty

import com.mateuyabar.aoc.util.AocSolution

fun main() = Ex2B().run()

class Ex2B : AocSolution(2020, 2, 1){
    override fun calculate(input: String): String {
        val numbers = input.dropLast(1).lines().count{
            val (ini, end, letter, text) = it.split("[ -]".toRegex())
            isValid(ini.toInt(), end.toInt(), letter.get(0), text)
        }
        return numbers.toString()
    }

    fun isValid(ini: Int, end: Int, letter: Char, text: String) =
        ((text[ini-1] == letter) != (text[end-1] == letter)) && ((text[ini-1] == letter) || (text[end-1] == letter))

}


