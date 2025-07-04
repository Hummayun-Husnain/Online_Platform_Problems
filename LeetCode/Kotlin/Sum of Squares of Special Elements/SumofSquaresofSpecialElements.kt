fun sumOfSquares(nums: IntArray): Int {
    var result = 0
    for(i in 1 .. nums.size) {
        if(nums.size % i == 0) {
            result += nums[i - 1]*nums[i - 1]
        }
    }
    return result
}
fun main() {
    val nums = intArrayOf(1,2,3,4)
    print(sumOfSquares(nums))
}