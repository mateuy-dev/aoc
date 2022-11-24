package com.mateuyabar.aoc.twenty.ex8b

import com.mateuyabar.aoc.util.*
import java.util.concurrent.atomic.DoubleAccumulator


private val exercise = AocExercice(
    year = 2020,
    day = 8,
    level = 1   ,
    samples = listOf(
        AocSample(output = "8",
            input ="""nop +0
acc +1
jmp +4
acc +3
jmp -3
acc -99
acc +1
jmp -4
acc +6""")
    ),
)

fun main() {
    solution.run()
}

private data class Instruction(var name: String, val value: Int, var visited: Boolean = false) {
    companion object {
        fun parse(it: String): Instruction {
            val split = it.split(" ")
            val mult = if(split[1][0] =='+') 1 else -1
            val value = split[1].drop(1).toInt()
            return Instruction(split.first(), mult*value)
        }
    }
}

private data class Status(var position: Int=0, var accumulator: Int=0, var repeated : Boolean = false)

private val solution = object : AocSolution(exercise) {
    override fun calculate(input: String): String {
        val instructions = input.lines().map { Instruction.parse(it)}
        for(i in 0..instructions.lastIndex){
            if(instructions[i].name!="acc"){
                val currentInstructions : List<Instruction> = copySwitched(instructions, i)
                val status = solve(currentInstructions)
                if(currentInstructions.size==status.position){
                    return status.accumulator.toString()
                }
            }
        }

        throw ShouldNotOccurExeption()
    }

    private fun copySwitched(instructions: List<Instruction>, i: Int): List<Instruction> {
        val copied = instructions.map { it.copy() }
        copied[i].name = if(copied[i].name=="jmp") "nop" else "jmp"
        return copied
    }

    private fun solve(instructions: List<Instruction>) : Status {
        val stauts = Status()
        while(stauts.position<=instructions.lastIndex && !instructions[stauts.position].visited){
            instructions.next(stauts)
        }
        return stauts
    }
}

private fun List<Instruction>.next(stauts: Status) {
    val instruction = this[stauts.position]
    instruction.visited = true
    when(instruction.name){
        "acc" -> {
            stauts.position++
            stauts.accumulator+=instruction.value
        }
        "jmp" -> {
            stauts.position+= instruction.value
        } else -> {
            stauts.position++
        }
    }
}
