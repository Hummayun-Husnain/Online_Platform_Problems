fun main() {
    val nums = intArrayOf(1,3,5,6)
    val target = 4
    println(searchInsert(nums,target))
}

fun searchInsert(nums: IntArray, target: Int): Int {
    var result = 0
    for(i in nums.indices) {
        if(nums[i] >= target) {
            result = i
            break
        }
        else {
            result = i + 1
        }
    }
    return result
}