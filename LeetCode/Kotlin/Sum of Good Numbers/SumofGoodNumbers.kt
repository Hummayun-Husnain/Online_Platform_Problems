fun sumOfGoodNumbers(nums: IntArray, k: Int): Int {
    var result: Int = 0
    for(i in 0 until k) {
        if(nums[i] > nums[i + k]) {
            result += nums[i]
        }
    }
    for(i in k until nums.size - k) {
        if(nums[i] > nums[i - k] && nums[i] > nums[i + k]) {
            result += nums[i]
        }
    }
    for(i in nums.size - k until nums.size) {
        if(nums[i] > nums[i - k]) {
            result += nums[i]
        }
    }
    return result
}
fun main() {
    val nums = intArrayOf(1,3,2,1,5,4)
    print(sumOfGoodNumbers(nums, 2))
}