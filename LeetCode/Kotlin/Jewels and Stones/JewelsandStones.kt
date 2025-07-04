fun numJewelsInStones(jewels: String, stones: String): Int {
    var result = 0
    for(i in stones) {
        for(j in jewels) {
            if(i == j) {
                result++
            }
        }
    }
    return result
}
fun main() {
    val jewels = "aA"
    val stones = "aAAbbbb"
    print(numJewelsInStones(jewels, stones))
}