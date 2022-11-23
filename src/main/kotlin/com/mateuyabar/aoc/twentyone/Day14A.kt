//package com.mateuyabar.aoc.twentyone
//
//import java.util.*
//
//val text14T = """NNCB
//
//CH -> B
//HH -> N
//CB -> H
//NH -> C
//HB -> C
//HC -> B
//HN -> C
//NN -> C
//BH -> H
//NC -> B
//NB -> B
//BN -> B
//BB -> N
//BC -> B
//CC -> N
//CN -> C"""
//val text14="""CKFFSCFSCBCKBPBCSPKP
//
//NS -> P
//KV -> B
//FV -> S
//BB -> V
//CF -> O
//CK -> N
//BC -> B
//PV -> N
//KO -> C
//CO -> O
//HP -> P
//HO -> P
//OV -> O
//VO -> C
//SP -> P
//BV -> H
//CB -> F
//SF -> H
//ON -> O
//KK -> V
//HC -> N
//FH -> P
//OO -> P
//VC -> F
//VP -> N
//FO -> F
//CP -> C
//SV -> S
//PF -> O
//OF -> H
//BN -> V
//SC -> V
//SB -> O
//NC -> P
//CN -> K
//BP -> O
//PC -> H
//PS -> C
//NB -> K
//VB -> P
//HS -> V
//BO -> K
//NV -> B
//PK -> K
//SN -> H
//OB -> C
//BK -> S
//KH -> P
//BS -> S
//HV -> O
//FN -> F
//FS -> N
//FP -> F
//PO -> B
//NP -> O
//FF -> H
//PN -> K
//HF -> H
//VK -> K
//NF -> K
//PP -> H
//PH -> B
//SK -> P
//HN -> B
//VS -> V
//VN -> N
//KB -> O
//KC -> O
//KP -> C
//OS -> O
//SO -> O
//VH -> C
//OK -> B
//HH -> B
//OC -> P
//CV -> N
//SH -> O
//HK -> N
//NO -> F
//VF -> S
//NN -> O
//FK -> V
//HB -> O
//SS -> O
//FB -> B
//KS -> O
//CC -> S
//KF -> V
//VV -> S
//OP -> H
//KN -> F
//CS -> H
//CH -> P
//BF -> F
//NH -> O
//NK -> C
//OH -> C
//BH -> O
//FC -> V
//PB -> B"""
//
//fun main() {
//    val lines = text14T.lines()
//    var sequence = lines[0]
//    val letters = sequence.toList().toSet()
//    val conversions = lines.subList(2, lines.size).map { it.split(" -> ")[0] to it.split(" -> ")[1] }.toMap()
//
//    for(conversion in conversions){
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
//
//}