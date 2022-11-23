package com.mateuyabar.aoc.twentyone

import forEachNeighbour

val text11T = """5483143223
2745854711
5264556173
6141336146
6357385478
4167524645
2176841721
6882881134
4846848554
5283751526"""

private val text11 = """4585612331
5863566433
6714418611
1746467322
6161775644
6581631662
1247161817
8312615113
6751466142
1161847732"""

data class Octopus(val x: Int, val y: Int, var energy: Int, var flashed: Boolean=false){
    fun increase():Boolean{
        energy++
        return energy==10
    }

    fun flashNow():Boolean {
        if(energy>=10 && !flashed) {
            flashed = true
            return true
        }
        return false
    }

    fun cleanIfFlashed() {
        if(flashed) {
            energy = 0
            flashed = false
        }
    }

    override fun toString(): String {
        return energy.toString()
    }

}



fun main(){

    val map = text11.lines().mapIndexed() { i, row -> row.toList().mapIndexed { j, char-> Octopus(i,j,char.digitToInt()) } }


    for(i in 0..Int.MAX_VALUE){
        var flashCount = 0

        val flashToApply = mutableListOf<Octopus>()

        map.flatten().forEach{
            if(it.increase())
                flashToApply += it
        }
        println(map.joinToString("\n"))
        while(flashToApply.isNotEmpty()) {
            val octopus = flashToApply.removeFirst()
            if (octopus.flashNow()) {
                flashCount++
                map.forEachNeighbour(octopus.x, octopus.y, true) { _, _, octopus ->
                    if(octopus.increase())
                        flashToApply += octopus
                }
            }

        }
        map.flatten().forEach{ it.cleanIfFlashed() }
        if(flashCount==map.flatten().size){
            println(i+1)
            break;
        }
    }

}