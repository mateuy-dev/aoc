package com.mateuyabar.aoc.util


class AocExercice(val year: Int, val day: Int, val level: Int, val samples : List<AocSample> = listOf()){
    constructor(year: Int, day: Int, level: Int, sampleInput: String = "", sampleOutput : String = ""):
            this(year, day, level, listOf(AocSample(sampleInput, sampleOutput)))
}

