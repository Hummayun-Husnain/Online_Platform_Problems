fun main() {
    val nums = intArrayOf(9,4,3,2)
    println(maximumDifference(nums))
    val numa = intArrayOf(7,1,5,4)
    println(maximumDifference(numa))
    val numb = intArrayOf(1,5,2,10)
    println(maximumDifference(numb))
}

fun maximumDifference(nums: IntArray): Int {
    var maximumDifference = -1
    for(i in nums.indices) {
        for(j in i + 1 until nums.size) {
            if(nums[i] < nums[j] && maximumDifference < (nums[j] - nums[i])) {
                maximumDifference = nums[j] - nums[i]
            }
        }
    }
    return maximumDifference
}