package com.mateuyabar.aoc.twenty

import com.mateuyabar.aoc.util.AocSolution
import com.mateuyabar.aoc.util.ShouldNotOccurExeption

fun main() = Ex1B().run()

class Ex1B : AocSolution(2020, 1, 2){
    override fun calculate(input: String): String {
        val numbers = input.dropLast(1).lines().map{it.toLong()}
        for(n1 in numbers){
            for(n2 in numbers){
                for(n3 in numbers){
                    if(n1+n2+n3==2020L){
                        return (n1*n2*n3).toString()
                    }
                }
            }
        }
        throw ShouldNotOccurExeption()
    }

}

