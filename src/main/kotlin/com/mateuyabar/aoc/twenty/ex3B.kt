package com.mateuyabar.aoc.twenty

import com.mateuyabar.aoc.util.AocSolution

fun main() {
    val sampleInput = """..##.......
#...#...#..
.#....#..#.
..#.#...#.#
.#...##..#.
..#.##.....
.#.#.#....#
.#........#
#.##...#...
#...##....#
.#..#...#.#"""
    val sampleOutput = "336"
    object : AocSolution(2020, 3, 2, sampleInput, sampleOutput) {
        override fun calculate(input: String): String {
            val map = input.lines().map{ line -> line.map { it =='#'}}

            val trees = calculateTrees(map, 1, 1) *
                    calculateTrees(map, 3, 1) *
                    calculateTrees(map, 5, 1) *
                    calculateTrees(map, 7, 1) *
                    calculateTrees(map, 1, 2)

            return trees.toString()
        }

        fun calculateTrees(map: List<List<Boolean>>, plusX: Int, plusY: Int): Long {
            val widht = map.first().size
            val height = map.size
            var  x = 0
            var y = 0
            var trees = 0L
            while(y<height){
                trees += if(map[y][x]) 1 else 0
                x=(x+plusX)%widht
                y = y+plusY

            }
            return trees
        }
    }.run()
}
