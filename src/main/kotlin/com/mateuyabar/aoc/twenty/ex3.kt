package com.mateuyabar.aoc.twenty

import com.mateuyabar.aoc.util.AocSolution

fun main() = object : AocSolution(2020, 3, 1) {
    override fun calculate(input: String): String {
        val map = input.dropLast(1).lines().map{ line -> line.map { it =='#'}}
        val widht = map.first().size
        val height = map.size
        var  x = 0
        var y = 0
        var trees = 0
        while(y<height){
            trees += if(map[y][x]) 1 else 0
            x=(x+3)%widht
            y++

        }
        return trees.toString()
    }
}.run()
