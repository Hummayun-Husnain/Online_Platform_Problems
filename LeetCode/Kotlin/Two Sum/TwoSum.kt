fun main() {
    twoSum(intArrayOf(2, 7, 11, 15), 9).forEach { print("$it ") }
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    for(i in nums.indices) {
        val num = target - nums[i]
        if(num in nums) {
            val numb = nums.indexOf(num)
            if(numb != i){
                return intArrayOf(i,numb)
            }
        }
    }
    return intArrayOf()
}