package com.mateuyabar.aoc.twentyone

import kotlin.math.max

private val text = "target area: x=56..76, y=-162..-134\n"


fun main(){
    val destX = 56..76
    val destY = -162..-134

    //val destX = 20..30
    //val destY = -10..-5

    var maxvx = 0
    var maxvy = 0
    var maxy = 0

    val minVx = destX.first /2

    val startVx = minVx

    val result = mutableListOf<List<Int>>()
    for(startVx in 0..1000){
        for(startVy in -1000..1000){
            var currentMaxy = 0
            var x = 0
            var y = 0
            var vy = startVy
            var vx = startVx
            for(t in 0..1000){
                x+=vx
                y+=vy
                currentMaxy = max(y, currentMaxy)

                vx = max(0, vx-1)
                vy--
                if(x in destX && y in destY){
                    //if(currentMaxy>maxy){
                        maxvy = startVy
                        maxvx = startVx
                        maxy = currentMaxy
                        result += listOf(maxvx, maxvy)
                    //}
                    break
                }
            }
        }
    }
    // x=v*t-a*t*t/2

println(maxy)
    println(result.count())
}