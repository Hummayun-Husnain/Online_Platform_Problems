fun buildArray(nums: IntArray): IntArray {
    var result = IntArray(nums.size)
    nums.forEachIndexed { i,_->
        result[i] = nums[nums[i]]
    }
    return result
}

fun main() {
    val arr = intArrayOf(0,2,1,5,3,4)
    val arr2 = buildArray(arr)
    for(i in 0 until arr2.size) {
        println(arr2[i])
    }
}