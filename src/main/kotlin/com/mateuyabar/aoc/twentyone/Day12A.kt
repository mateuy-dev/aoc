package com.mateuyabar.aoc.twentyone

val text12A = """start-A
start-b
A-c
A-b
b-d
A-end
b-end"""

val text12B = """dc-end
HN-start
start-kj
dc-start
dc-HN
LN-dc
HN-end
kj-sa
kj-HN
kj-dc"""

val text12 ="""start-co
ip-WE
end-WE
le-ls
wt-zi
end-sz
wt-RI
wt-sz
zi-start
wt-ip
YT-sz
RI-start
le-end
ip-sz
WE-sz
le-WE
le-wt
zi-ip
RI-zi
co-zi
co-le
WB-zi
wt-WE
co-RI
RI-ip"""



data class Node(val name: String) {
    val edges = mutableListOf<Node>()
    val big: Boolean get() = name.uppercase()==name

    fun addEdge(node : Node){
        edges+=node
    }
}

class Graph(){
    val edges = mutableListOf<Node>()

    fun createOrFindNode(name: String):Node{
        val currentNode = findNodeByName(name)
        if(currentNode==null){
            val newNode = Node(name)
            edges+=newNode
            return newNode
        }
        else return currentNode
    }

    fun findNodeByName(name : String) = edges.firstOrNull() { it.name == name }

    fun findPaths() : MutableList<List<Node>> {
        val startNode = findNodeByName("start")
        val result = mutableListOf<List<Node>>()
        findPaths(startNode!!, listOf<Node>(), result)
        return result
    }

    fun addEdge(name1: String, name2: String){
        val node1 = createOrFindNode(name1)
        val node2 = createOrFindNode(name2)
        node1.addEdge(node2)
        node2.addEdge(node1)
    }

    private fun findPaths(node: Node, visited: List<Node>, paths: MutableList<List<Node>>) {
        if(node.name == "end") {
            println(visited)
            paths.add(visited)
        } else if(!node.big && visited.contains(node)){
            // dead end
        } else {
            val newVisited = visited+node
            for(newNode in node.edges){
                findPaths(newNode, newVisited, paths)
            }
        }
    }
}

fun main() {
    val graph = Graph()


    text12.lines().map { it.split("-") }.forEach(){
        graph.addEdge(it[0], it[1])
    }
    println(graph.findPaths().size)
}


