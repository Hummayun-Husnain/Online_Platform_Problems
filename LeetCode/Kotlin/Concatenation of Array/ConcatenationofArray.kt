fun getConcatenation(nums: IntArray): IntArray {
    var n = nums.size
    var result = IntArray(2*n)
    for(i in 0 until nums.size) {
        result[i] = nums[i]
        result[i + n] = nums[i]
    }
    return result
}
fun main() {
    val nums = intArrayOf(1,3,2,1)
    val lists = getConcatenation(nums)
    lists.forEach{println(it)}
}