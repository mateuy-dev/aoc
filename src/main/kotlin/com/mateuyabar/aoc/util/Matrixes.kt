/**
 * Performs the given action on each neighbour element of a matrix. If diagonals=true, diagonal positions are also applied
 */
inline fun <T> List<List<T>>.forEachNeighbour(i: Int, j: Int, diagonals: Boolean = false, action: (i: Int,j: Int, T) -> Unit): Unit {
    applyIfExists(i-1, j, action)
    applyIfExists(i+1, j, action)
    applyIfExists(i, j+1, action)
    applyIfExists(i, j-1, action)
    if(diagonals){
        applyIfExists(i-1, j-1, action)
        applyIfExists(i-1, j+1, action)
        applyIfExists(i+1, j-1, action)
        applyIfExists(i+1, j+1, action)
    }
}

/**
 * Matrix version of the forEachIndexed
 */
inline fun <T> Iterable<Iterable<T>>.forEachCellIndexed(action: (i: Int,j: Int, T) -> Unit) {
    forEachIndexed(){ i, row ->
        row.forEachIndexed(){ j, value ->
            action(i, j, value)
        }
    }
}

inline  fun <T> List<List<T>>.indexExists(i: Int, j: Int) = i in indices && j in this[i].indices

inline  fun <T> List<List<T>>.applyIfExists(i: Int, j: Int, action: (i: Int,j: Int, T) -> Unit) {
    if(indexExists(i,j))  action(i, j, this[i][j])
}
