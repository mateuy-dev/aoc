package com.mateuyabar.aoc.twentyone

import java.util.*
import kotlin.io.path.Path

data class Board(val board: List<List<Int>>, val checked : MutableList<MutableList<Int>>, val checkedSwapped: MutableList<MutableList<Int>>){
    fun checkNumber(number: Int) : Boolean{
        for((i, row) in board.withIndex()){
            val index = row.indexOf(number)
            if(index!=-1){
                checked[i][index] = 1
                checkedSwapped[index][i] = 1
                if(checked[i].sum()==5 || checkedSwapped[index].sum()==5){
                    printBoard(number)
//                    System.exit(0)
                    return true
                }
            }
        }
        return false
    }

    fun printBoard(number: Int) {
        var sum = 0
        for(i in 0..4){
            for(j in 0..4){
                if(checked[i][j]!=1)
                    sum += board[i][j]
            }
        }
        println(sum*number)

    }


}

fun main() {
    val scanner = Scanner(Path("data/aventofcode/4.txt"));
    val numbers = scanner.nextLine().split(",").map { it.toInt() }
    val boards = mutableListOf<Board>()
    while(scanner.hasNext()){
        val boardTable = List(5){
            MutableList(5){
                scanner.nextInt()
            }
        }
        boards += Board(boardTable, MutableList(5){ MutableList(5){0} }, MutableList(5){ MutableList(5){0} } )
    }


    for(number in numbers){
        val it = boards.iterator()
        while(it.hasNext()){
            val board = it.next()
            val finished = board.checkNumber(number)
            if(finished)
                it.remove()
            if(boards.isEmpty()){
                System.exit(0)
            }
        }

    }

}



