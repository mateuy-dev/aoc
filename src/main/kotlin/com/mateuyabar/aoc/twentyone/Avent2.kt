package com.mateuyabar.aoc.twentyone

import java.util.*
import kotlin.io.path.Path

data class Submarine(var depth: Int = 0, var distance: Int =0){
    fun forward(x: Int){
        distance+=x
    }
    fun down(x: Int){
        depth+=x
    }
    fun up(x: Int){
        depth-=x
    }
    fun move(direction: String, x: Int){
        when(direction){
            "forward" -> forward(x)
            "down" -> down(x)
            "up" -> up(x)
        }
    }
    fun result()=depth*distance
}

fun main() {
    val scanner = Scanner(Path("data/aventofcode/2.txt"));

    val submarine = Submarine()
    while(scanner.hasNext()){
        val direction = scanner.next()
        val x = scanner.nextInt()
        submarine.move(direction, x)
    }
    println(submarine.result())
}
