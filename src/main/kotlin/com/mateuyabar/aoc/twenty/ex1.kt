package com.mateuyabar.aoc.twenty

import com.mateuyabar.aoc.util.AocSolution
import com.mateuyabar.aoc.util.ShouldNotOccurExeption


fun main() {
    Ex1().run()
}

class Ex1 : AocSolution(2020, 1, 1){
    override fun calculate(input: String): String {
        val numbers = input.dropLast(1).lines().map{it.toInt()}
        for(number in numbers){
            val other = numbers.firstOrNull{ number+it ==2020}
            if(other!=null){
                return (number*other).toString()
            }
        }
        throw ShouldNotOccurExeption()
    }

}