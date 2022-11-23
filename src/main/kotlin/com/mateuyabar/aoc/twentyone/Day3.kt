package com.mateuyabar.aoc.twentyone

import java.io.File

fun main() {
    val name = "3"
    val lines = File("data/aventofcode", "$name.txt").readLines()
    //val lines = listOf("00100","11110","10110","10111","10101","01111","00111","11100","10000","11001","00010","01010")
    val numberLenght = lines[0].length

    val gammaValues = MutableList(numberLenght){0}
    val epsilonValues = MutableList(numberLenght){0}
    for(i in 0 until numberLenght){
        val oneCount = lines.count { it[i]=='1' }
        if(oneCount>(lines.size/2)){
            gammaValues[i] = 1
        } else {
            epsilonValues[i] = 1
        }
    }

    val gamma = Integer.parseInt(gammaValues.joinToString (""), 2);
    val epsilon = Integer.parseInt(epsilonValues.joinToString (""), 2);

    println("ex1:"+gamma*epsilon)

    var oxigen = lines
    var co2 = lines
    for(i in 0 until numberLenght){
        val oxigenValue = if(oxigen.count { it[i]=='1' }>=oxigen.count { it[i]=='0' }) '1' else '0'
        val c02Value = if(co2.count { it[i]=='1' }>=co2.count { it[i]=='0' }) '0' else '1'

        if(oxigen.size>1)
            oxigen = oxigen.filter { it[i] == oxigenValue }
        if(co2.size>1)
            co2 = co2.filter { it[i] == c02Value }
    }

    val oxigenInt = Integer.parseInt(oxigen[0], 2);
    val co2Int = Integer.parseInt(co2[0], 2);
    println(oxigenInt)
    println(co2Int)
    println(oxigenInt*co2Int)
}
