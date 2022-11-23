package com.mateuyabar.aoc.twentyone

import java.util.*
import kotlin.io.path.Path

//fun main() {
//    val scanner = Scanner(Path("data/aventofcode/1_1.txt"));
//    var previous = scanner.nextInt()
//    var counter = 0
//    while(scanner.hasNext()){
//        val current = scanner.nextInt()
//        if(current>previous)
//            counter++
//        previous = current
//    }
//    println(counter)
//}

fun main() {
    val scanner = Scanner(Path("data/aventofcode/1_1.txt"));
    val values = mutableListOf(scanner.nextInt(), scanner.nextInt(), scanner.nextInt())
    var counter = 0
    while(scanner.hasNext()){
        val next = scanner.nextInt()
        if(next>values.first())
            counter++
        values.removeAt(0)
        values+=next
    }
    println(counter)
}
