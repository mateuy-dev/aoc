package com.mateuyabar.aoc.twentyone//import kotlin.math.max
//
///*
//open class Node()
//
//interface ParentedNode{
//    var parent: Node
//}
//
//class MidNode(var parent: SNum):Node()
//
//class Leaf(var value: Int) : Node()
//
//class MidNode()*/
//
//data class SNum(var parent: SNum?, var left: SNum?, var right: SNum?, var value: Int?){
//    fun sum(num2: SNum):SNum{
//        val summed = this.sumOnly(num2)
//        println(summed)
//        while(summed.reduce(0, true)||summed.reduce(0, false)){
//            println(summed)
//        }
//        return summed
//    }
//    fun sumOnly(num2: SNum): SNum{
//        this.parent =  SNum(null, this, num2, null)
//        num2.parent = this.parent
//        return this.parent!!
//    }
//    fun rightLeaf(): SNum{
//        if(value!=null)
//            return this
//        else
//            return right!!.rightLeaf()
//    }
//
//    fun leftLeaf(): SNum{
//        if(value!=null)
//            return this
//        else
//            return left!!.leftLeaf()
//    }
//
//    fun rightNeighbour():SNum?{
//
//        if(parent==null)
//            return null
//        if(parent!!.right!==this){
//            return parent!!.right!!.leftLeaf()
//        } else {
//            return parent!!.rightNeighbour()
//        }
//    }
//
//    fun leftNeighbour():SNum?{
//        if(parent==null)
//            return null
//        if(parent!!.left!==this){
//            return parent!!.left!!.rightLeaf()
//        } else {
//            return parent!!.leftNeighbour()
//        }
//    }
//
//
//    fun reduce(level:Int = 0, explode:Boolean =true):Boolean{
//        if(level>4 && value!=null && explode) {
//            parent!!.explode()
//            return true
//        }
//        if(value ?: 0 > 9 && !explode){
//            split()
//            return true
//        }
//        return left?.reduce(level+1, explode) ?: false || right?.reduce(level+1, explode) ?: false
//
//
//    }
//
//    private fun split() {
//        val min = value!!/2
//        val max = value!!/2 + value!!%2
//
//        this.left = SNum(this, null, null, min)
//        this.right= SNum(this, null, null, max)
//        this.value= null
//
//    }
//
//    private fun explode() {
//        left!!.leftNeighbour()?.sumValue(left!!.value!!)
//        right!!.rightNeighbour()?.sumValue(right!!.value!!)
//        this.value = 0
//        left=null
//        right=null
//    }
//
//    private fun replace(toReplace: SNum, newNode: SNum) {
//        newNode.parent = this
//        if(left==toReplace)
//            left= newNode
//        else
//            right = newNode
//    }
//
//    private fun sumValue(value: Int) {
//        this.value = this.value!!+value
//    }
//
//    override fun toString(): String {
//        return toLine()
//    }
//
//    fun toLine(): String {
//        if(value!=null)
//            return value.toString()
//        else
//            return "[${left!!.toLine()},${right!!.toLine()}]"
//    }
//
//    fun magnitude():Int{
//        if(value!=null) return value!!
//        return left!!.magnitude()*3+right!!.magnitude()*2
//    }
//
//    fun deepClone(): SNum {
//        val newLeft = left?.deepClone()
//        val newright = right?.deepClone()
//        val new = SNum(this, newLeft, newright, value)
//        if(newLeft!=null) newLeft.parent = new
//        if(newright!=null) newright.parent = new
//        return new
//    }
//}
//
//class Reader(val com.mateuyabar.aoc.twentytwo.getText:String){
//    var i = 0
//
//    @OptIn(ExperimentalStdlibApi::class)
//    fun read():SNum{
//        val char = com.mateuyabar.aoc.twentytwo.getText[i]
//        i++
//        if(char in '0'..'9'){
//            return SNum(null, null, null, char.digitToInt())
//        } else if (char=='['){
//            val left = read()
//            val right = read()
//            val parent = SNum(null, left, right, null)
//            left.parent = parent
//            right.parent = parent
//            return parent
//        } else {
//            return read()
//        }
//    }
//}
//
//val text18T3="""[[[0,[5,8]],[[1,7],[9,6]]],[[4,[1,2]],[[1,4],2]]]
//[[[5,[2,8]],4],[5,[[9,9],0]]]
//[6,[[[6,2],[5,6]],[[7,6],[4,7]]]]
//[[[6,[0,7]],[0,9]],[4,[9,[9,0]]]]
//[[[7,[6,4]],[3,[1,3]]],[[[5,5],1],9]]
//[[6,[[7,3],[3,2]]],[[[3,8],[5,7]],4]]
//[[[[5,4],[7,7]],8],[[8,3],8]]
//[[9,3],[[9,9],[6,[4,9]]]]
//[[2,[[7,7],7]],[[5,8],[[9,3],[0,2]]]]
//[[[[5,2],5],[8,[3,7]]],[[5,[7,5]],[4,4]]]"""
//
//val text18T1 = """[[[[4,3],4],4],[7,[[8,4],9]]]
//    |[1,1]""".trimMargin()
//
//val text18T = """[1,1]
//[2,2]
//[3,3]
//[4,4]"""
//
//val text18T1To5="""[1,1]
//[2,2]
//[3,3]
//[4,4]
//[5,5]
//[6,6]"""
//
//val text18 = """[[7,[8,[3,5]]],[[[3,6],9],1]]
//[[[[1,7],8],[0,4]],[[[0,9],2],[2,[5,6]]]]
//[[[4,[4,4]],[8,[4,4]]],[[5,4],6]]
//[[[1,[1,3]],[[9,6],1]],[[4,[5,4]],[[4,4],[0,8]]]]
//[[[[6,2],[2,5]],[2,1]],[[1,5],7]]
//[[[[5,0],[2,7]],[[2,5],2]],[2,[3,2]]]
//[[[6,[6,6]],[0,[2,8]]],[[8,[5,6]],[4,5]]]
//[[[6,[3,5]],8],[[2,[7,0]],5]]
//[[[[7,8],[3,6]],[1,6]],[[[4,2],1],[[0,7],[5,6]]]]
//[8,2]
//[[5,5],[[2,[9,1]],8]]
//[[[4,8],[[1,8],2]],[9,2]]
//[2,[[8,[8,3]],[0,6]]]
//[[[6,6],[[6,0],6]],[0,[[3,4],3]]]
//[[[[2,9],[5,9]],[2,[4,3]]],[6,0]]
//[[[6,2],0],[7,7]]
//[[[9,6],5],[2,[[0,1],[5,5]]]]
//[[6,[[0,1],[5,1]]],5]
//[4,[[[4,2],3],[2,[5,0]]]]
//[[[7,9],2],2]
//[[[5,[2,1]],1],[[1,1],[8,5]]]
//[[[[5,9],0],[[1,9],0]],4]
//[[7,[0,5]],[[0,3],[8,2]]]
//[[6,[9,[7,7]]],6]
//[2,[[1,[1,0]],[4,[6,1]]]]
//[[0,6],[[[5,1],6],[[4,7],[8,0]]]]
//[[[1,[4,7]],[0,[1,2]]],[[1,1],[[1,2],[1,3]]]]
//[[8,[3,0]],[3,[1,[8,1]]]]
//[[[7,[4,0]],[[8,7],2]],[[7,[7,3]],7]]
//[3,[[1,7],2]]
//[8,[[[1,5],0],1]]
//[[6,[1,4]],7]
//[[[[2,6],2],8],1]
//[9,7]
//[9,[[[1,1],1],[[3,0],[7,3]]]]
//[[[[8,5],7],[[5,1],[6,4]]],[4,[[7,6],[2,7]]]]
//[[[[8,7],1],0],[[9,9],[[1,0],8]]]
//[[9,[[1,1],7]],[[3,0],4]]
//[[[[8,2],4],[9,[7,9]]],[[0,2],[[3,0],5]]]
//[[[[3,6],3],[[9,7],[0,6]]],[[[4,9],[1,3]],[2,[7,3]]]]
//[[[[3,8],0],[[3,6],5]],[[3,[4,2]],[[6,1],[8,5]]]]
//[[2,7],[[0,0],8]]
//[[[[0,3],7],[2,0]],3]
//[[0,2],[[[3,1],0],[0,0]]]
//[[[[6,1],7],[[8,4],[2,4]]],[[1,6],[2,3]]]
//[[2,[2,[9,1]]],[4,[[0,4],9]]]
//[[[3,[5,6]],7],1]
//[[[3,0],[8,[9,3]]],[[[1,1],1],[6,7]]]
//[[[6,[4,4]],[[1,9],1]],[[[8,1],[9,8]],[[6,3],1]]]
//[[[5,8],[[0,3],[1,7]]],[[[3,2],[4,7]],1]]
//[[5,5],[[[8,3],[6,6]],2]]
//[[[[1,9],[8,5]],[[7,7],8]],[0,[8,[7,4]]]]
//[[6,[4,[4,3]]],[5,[6,[7,2]]]]
//[[0,[[9,0],0]],5]
//[[[[5,6],[1,3]],[[0,5],[7,5]]],[[[0,4],[3,6]],[8,[3,6]]]]
//[[3,[[4,7],[7,0]]],[[[4,1],5],[[6,6],[7,4]]]]
//[[[[4,3],[0,1]],[[7,3],[2,3]]],[[[3,7],[2,2]],[6,5]]]
//[[1,1],[[[1,4],6],[6,[3,9]]]]
//[[[[0,8],[2,0]],5],[4,[[6,1],[2,1]]]]
//[[7,[3,[7,2]]],[[7,9],8]]
//[[[4,[9,8]],[8,[3,2]]],[7,9]]
//[[[4,[4,2]],[5,[0,3]]],[[[4,9],[2,9]],[[1,5],[0,8]]]]
//[[1,[[9,8],0]],[5,[[4,3],5]]]
//[[[[5,1],3],[[2,9],[9,0]]],[1,[6,3]]]
//[[[6,4],[6,1]],7]
//[[4,8],[[7,2],6]]
//[[[5,[4,8]],[[1,7],[2,8]]],[6,[[8,4],[3,5]]]]
//[[5,8],[[[4,0],[6,0]],[5,[6,0]]]]
//[[3,[[5,3],8]],[8,5]]
//[[[2,6],[1,[2,3]]],[[[1,7],[5,7]],[[0,0],[0,5]]]]
//[[0,[[4,3],[3,6]]],[[2,[6,6]],[0,[2,9]]]]
//[[[5,9],[6,2]],[[7,6],8]]
//[[9,2],[1,[[0,5],[5,0]]]]
//[[[3,1],[9,3]],3]
//[[[[2,0],[4,2]],6],[[[5,2],[7,8]],[[0,7],3]]]
//[[7,[[3,9],[6,3]]],[2,[[6,4],3]]]
//[[5,[3,[7,4]]],[[2,5],[0,9]]]
//[3,7]
//[[3,9],[[[4,4],9],[[3,1],7]]]
//[[[[4,0],1],[8,[3,6]]],[[9,[4,4]],[[9,9],9]]]
//[[8,[[8,1],5]],[[[9,1],4],[[8,5],3]]]
//[[6,[[6,3],[3,7]]],4]
//[[[1,[0,8]],9],[[8,5],[3,[0,5]]]]
//[[[[3,1],0],[[8,5],[1,0]]],[0,2]]
//[[2,[4,7]],2]
//[[[2,0],[2,2]],4]
//[4,[[5,8],5]]
//[[[2,[0,5]],[[3,3],[6,6]]],1]
//[[[2,[2,4]],[5,[7,1]]],[3,5]]
//[[2,[9,[3,9]]],9]
//[[[7,[7,1]],[[5,2],1]],[[2,1],[9,[7,3]]]]
//[[4,[4,6]],4]
//[[[4,2],[9,[3,8]]],[[2,4],0]]
//[[[7,[0,3]],4],[[[1,8],4],[[5,1],1]]]
//[[[1,3],3],[[4,9],[[0,0],6]]]
//[[[4,1],0],[[[5,6],[0,8]],[[2,1],1]]]
//[[3,[3,[7,9]]],[[[6,8],8],[[7,9],3]]]
//[[4,[[1,6],[4,6]]],[[1,8],[3,8]]]
//[[[[5,9],2],[[6,7],4]],3]
//[[[[2,1],[1,9]],7],[[[0,9],[0,5]],[[2,5],[5,0]]]]"""
//
//val text18T4 = """[[[0,[4,5]],[0,0]],[[[4,5],[2,6]],[9,5]]]
//[7,[[[3,7],[4,3]],[[6,3],[8,8]]]]
//[[2,[[0,8],[3,4]]],[[[6,7],1],[7,[1,6]]]]
//[[[[2,4],7],[6,[0,5]]],[[[6,8],[2,8]],[[2,1],[4,5]]]]
//[7,[5,[[3,8],[1,4]]]]
//[[2,[2,2]],[8,[8,1]]]
//[2,9]
//[1,[[[9,3],9],[[9,0],[0,7]]]]
//[[[5,[7,4]],7],1]
//[[[[4,2],2],6],[8,7]]"""
//
//val text18Tv2 = """[[[0,[5,8]],[[1,7],[9,6]]],[[4,[1,2]],[[1,4],2]]]
//[[[5,[2,8]],4],[5,[[9,9],0]]]
//[6,[[[6,2],[5,6]],[[7,6],[4,7]]]]
//[[[6,[0,7]],[0,9]],[4,[9,[9,0]]]]
//[[[7,[6,4]],[3,[1,3]]],[[[5,5],1],9]]
//[[6,[[7,3],[3,2]]],[[[3,8],[5,7]],4]]
//[[[[5,4],[7,7]],8],[[8,3],8]]
//[[9,3],[[9,9],[6,[4,9]]]]
//[[2,[[7,7],7]],[[5,8],[[9,3],[0,2]]]]
//[[[[5,2],5],[8,[3,7]]],[[5,[7,5]],[4,4]]]"""
//
//@OptIn(ExperimentalStdlibApi::class)
//fun com.mateuyabar.aoc.twentytwo.main(){
//    val nums= text18.lines().map{Reader(it).read()}
//    /*var num = nums.first()
//    for(i in 1..nums.lastIndex){
//        num = num.sum(nums[i])
//        println("NUM: $num")
//    }
//
//    println(num.toLine())
//    println(num.magnitude())
//    */
//    var max = 0
//    for(i in nums.indices){
//        for(j in nums.indices){
//            if(i==j) continue
//            val magnitude = nums[i].deepClone().sum(nums[j].deepClone()).magnitude()
//            max = max(max, magnitude)
//            println("Sol: ${nums[i]}  - ${nums[j]} $magnitude")
//
//        }
//    }
//    println(max)
//}
