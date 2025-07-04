fun findColumnWidth(grid: Array<IntArray>): IntArray {
    var result = mutableListOf<Int>()
    var num = 0
    for(i in 0 until grid[0].size) {
        for(j in 0 until grid.size) {
            if(num < grid[j][i].toString().length) {
                num = grid[j][i].toString().length
            }
        }
        result.add(num)
        num = 0
    }
    return result.toIntArray()
}
fun main() {
    val grid: Array<IntArray> = arrayOf(
        intArrayOf(-15, 1, 3),
        intArrayOf(15, 7, 12),
        intArrayOf(5, 6, -2)
    )
    val result = findColumnWidth(grid)
    result.forEach{ println(it)}
}