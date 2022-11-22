package com.mateuyabar.aoc.twentyone/*val text16T = """8A004A801A8002F478"""

fun toBin(hex: Char):List<Int>{
    return when(hex){
        '0' -> listOf(0,0,0,0)
        '1' -> listOf(0,0,0,1)
        '2' -> listOf(0,0,1,0)
        '3' -> listOf(0,0,1,1)
        '4' -> listOf(0,1,0,0)
        '5' -> listOf(0,1,0,1)
        '6' -> listOf(0,1,1,0)
        '7' -> listOf(0,1,1,1)
        '8' -> listOf(1,0,0,0)
        '9' -> listOf(1,0,0,1)
        'A' -> listOf(1,0,1,0)
        'B' -> listOf(1,0,1,1)
        'C' -> listOf(1,1,0,0)
        'D' -> listOf(1,1,0,1)
        'E' -> listOf(1,1,1,0)
        'F' -> listOf(1,1,1,1)
        else -> TODO(hex.toString())
    }
}


fun com.mateuyabar.aoc.twentytwo.main(){
    val bitsGroupped = text16T.map (::toBin)
    val bits = bitsGroupped.flatten()
    var start = 0
    var end = start+3
    val version = bits.subList(start, end)
    start= end
    end =start+2
    val typeId = bits.subList(start, end)
    val lengthTypeId = bits[6]
    start = end +1
    if(lengthTypeId==1){
        end = start+11
        val packetCount = bits.subList(start, end).binToInt()
        start = end
    }


}

private fun  List<Int>.binToInt(): Int {
    var result = 0
    for(i in this.indices){
        this[i]
    }
}
*/