fun numIdenticalPairs(nums: IntArray): Int {
    var result: Int = 0
    for(i in 0 until nums.size) {
        for(j in i + 1 until nums.size) {
            if(nums[i] == nums[j]) {
                result++
            }
        }
    }
    return result
}

fun main() {
    val nums = intArrayOf(1,2,3,1,1,3)
    print(numIdenticalPairs(nums))
}
