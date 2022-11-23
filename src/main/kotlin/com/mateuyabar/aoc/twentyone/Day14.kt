package com.mateuyabar.aoc.twentyone

import java.util.*

val text14T = """NNCB

CH -> B
HH -> N
CB -> H
NH -> C
HB -> C
HC -> B
HN -> C
NN -> C
BH -> H
NC -> B
NB -> B
BN -> B
BB -> N
BC -> B
CC -> N
CN -> C"""
val text14="""CKFFSCFSCBCKBPBCSPKP

NS -> P
KV -> B
FV -> S
BB -> V
CF -> O
CK -> N
BC -> B
PV -> N
KO -> C
CO -> O
HP -> P
HO -> P
OV -> O
VO -> C
SP -> P
BV -> H
CB -> F
SF -> H
ON -> O
KK -> V
HC -> N
FH -> P
OO -> P
VC -> F
VP -> N
FO -> F
CP -> C
SV -> S
PF -> O
OF -> H
BN -> V
SC -> V
SB -> O
NC -> P
CN -> K
BP -> O
PC -> H
PS -> C
NB -> K
VB -> P
HS -> V
BO -> K
NV -> B
PK -> K
SN -> H
OB -> C
BK -> S
KH -> P
BS -> S
HV -> O
FN -> F
FS -> N
FP -> F
PO -> B
NP -> O
FF -> H
PN -> K
HF -> H
VK -> K
NF -> K
PP -> H
PH -> B
SK -> P
HN -> B
VS -> V
VN -> N
KB -> O
KC -> O
KP -> C
OS -> O
SO -> O
VH -> C
OK -> B
HH -> B
OC -> P
CV -> N
SH -> O
HK -> N
NO -> F
VF -> S
NN -> O
FK -> V
HB -> O
SS -> O
FB -> B
KS -> O
CC -> S
KF -> V
VV -> S
OP -> H
KN -> F
CS -> H
CH -> P
BF -> F
NH -> O
NK -> C
OH -> C
BH -> O
FC -> V
PB -> B"""


data class Sequence(val pairsCount : Map<String, Long>){

    fun nextSequence(conversions : Map<String, String>): Sequence {
        val result = conversions.keys.map { it to 0L}.toMap().toMutableMap()
        for(pairCount in pairsCount.filter { it.value>0 }){
            val nextSequence = pairCount.key[0]+conversions[pairCount.key]!!+pairCount.key[1]
            val firstPair = nextSequence.dropLast(1)
            val lastPair = nextSequence.drop(1)
            result[firstPair] = result[firstPair]!! + pairCount.value
            result[lastPair] = result[lastPair]!! + pairCount.value
        }
        return Sequence(result)
    }
    fun printResult(letters: Set<Char>, sequence: String) {
        val result = letters.map { it to 0L}.toMap().toMutableMap()
        for(pairCount in pairsCount) {
            result[pairCount.key[0]] = result[pairCount.key[0]]!! + pairCount.value
            result[pairCount.key[1]] = result[pairCount.key[1]]!! + pairCount.value
        }
        result[sequence.first()] = result[sequence.first()]!!+1
        result[sequence.last()] = result[sequence.last()]!!+1

        val max = result.maxByOrNull { it.value }!!.value/2
        val min = result.minByOrNull { it.value }!!.value/2
        println(max-min)
    }

}

fun main() {
    val lines = text14.lines()
    var sequence = lines[0]
    val conversions = lines.subList(2, lines.size).map { it.split(" -> ")[0] to it.split(" -> ")[1] }.toMap()
    val letters = conversions.keys.toList().joinToString("").toList().toSet()

    val pairCount = conversions.keys.map { it to 0L}.toMap().toMutableMap()
    sequence.windowed(2).forEach{pairCount[it] = pairCount[it]!! +1 }
    var sequence2 = Sequence(pairCount)
    repeat(40) {
        sequence2 = sequence2.nextSequence(conversions)
        println("total chars "+(sequence2.pairsCount.map { it.value }.sum()+1).toString())
        println()
    }
    sequence2.printResult(letters, sequence)
}

//
//data class PartialSolution(val sequence: String, val letters: Set<Char>){
//    val letterCount: Map<Char, Long>
//    init{
//        letterCount = letters.map { letter-> letter to  sequence.count { it==letter }.toLong()}.toMap()
//    }
//}
//
//
//
//
//class Day14{
//    val jump = 10
//    val letters: Set<Char>
//    val conversions : Map<String, String>
//    //val partialSolutions : Map<String, PartialSolution>
//    val mainSequence: String
//
//    constructor(text: String){
//        val lines = text.lines()
//        mainSequence = lines[0]
//        conversions = lines.subList(2, lines.size).map { it.split(" -> ")[0] to it.split(" -> ")[1] }.toMap()
//        letters = conversions.keys.toList().joinToString("").toList().toSet()
//        //partialSolutions = calculatePartialSolutions()
//        println("Calculated")
//    }
//
//    private fun calculatePartialSolutions(): Map<String, PartialSolution> {
//        val pairs = conversions.keys.toList()
//        val result = mutableMapOf<String, PartialSolution>()
//        for(conversion in conversions) {
//            var sequence = conversion.key
//            val partial = solutionAfter10(sequence)
//            result[sequence] = partial
//        }
//        return result
//    }
//
//    fun nextFastSequence(): Map<Char, Long> = nextFastSequence(mainSequence, 40)
//
//    fun nextFastSequence(sequence: String, timesLeft : Int): Map<Char, Long>{
//        val result = letters.map { it to 0L}.toMap().toMutableMap()
//
//        for(subsequence in sequence.windowed(2)){
//            val nextSecuence = partialSolutions[subsequence]!!
//            if(timesLeft>jump) {
//                val nextSecuenceResult = nextFastSequence(nextSecuence.sequence, timesLeft - jump)
//                merge(result, nextSecuenceResult)
//            } else {
//                merge(result, nextSecuence.letterCount)
//            }
//
//        }
//        return result
//    }
//
//    private fun merge(result: MutableMap<Char, Long>, nextSecuenceResult: Map<Char, Long>) {
//        for(nextItem in nextSecuenceResult){
//            result[nextItem.key]=result[nextItem.key]!!+nextItem.value
//        }
//    }
//
//    fun nextSequence(sequence: String): String{
//        var newSequence = ""
//        for(subsequence in sequence.windowed(2)){
//            val generated = conversions.get(subsequence)!!
//            newSequence+=subsequence[0]+generated
//        }
//        newSequence+=sequence.last()
//        return newSequence
//    }
//
//
//    fun solutionAfter20(sequence: String):PartialSolution{
//        var result = sequence
//        for(subsequence in sequence.windowed(2)){
//            val nextSecuence = partialSolutions[subsequence]!!
//        }
//        return PartialSolution(result, letters)
//    }
//
//    fun solutionAfter10(sequence: String):PartialSolution{
//        var result = sequence
//        repeat(10){
//            result = nextSequence(result)
//        }
//        return PartialSolution(result, letters)
//    }
//}
//
//fun calculateSolution(sequence: String, conversions: Map<String, String>){
//
//}

//fun main() {
//    val lines = text14T.lines()
//    var sequence = lines[0]
//    val letters = sequence.toList().toSet()
//    val conversions = lines.subList(2, lines.size).map { it.split(" -> ")[0] to it.split(" -> ")[1] }.toMap()

//    val day14  = Day14(text14)
//    day14.nextFastSequence()
//    var sequence = lines[0]
//    val letters = sequence.toList().toSet()
//    val conversions = lines.subList(2, lines.size).map { it.split(" -> ")[0] to it.split(" -> ")[1] }.toMap()
//    val pairs = conversions.keys.toList()
//
//    val after10 = mapOf<String, Map<String, Int>>()
//    for(conversion in conversions){
//        var sequence = conversion.key
//        repeat(10){
//            var newSequence = ""
//            for(subsequence in sequence.windowed(2)){
//                val generated = conversions.get(subsequence)!!
//                newSequence+=subsequence[0]+generated
//            }
//            newSequence+=sequence.last()
//            sequence = newSequence
//        }
//        val output = letters.map { letter-> letter to  sequence.count { it==letter }}.toMap()
//
//    }
//
//    repeat(40){
//        var newSequence = ""
//        for(subsequence in sequence.windowed(2)){
//            val generated = conversions.get(subsequence)!!
//            newSequence+=subsequence[0]+generated
//        }
//        newSequence+=sequence.last()
//        sequence = newSequence
//    }
//
//    val max = letters.map { letter -> sequence.count { it==letter } }.maxOrNull()!!
//    val min = letters.map { letter -> sequence.count { it==letter } }.minOrNull()!!
//    println(max-min)

//}