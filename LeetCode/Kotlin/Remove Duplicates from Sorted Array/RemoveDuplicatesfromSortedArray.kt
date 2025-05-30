fun main() {
    val nums = intArrayOf(0,0,1,1,1,1,2,2,3,3,4)
    val newLength = removeDuplicates(nums)
    println("New length: $newLength")
    println("Modified array: ${nums.slice(0 until newLength)}")
}
fun removeDuplicates(nums: IntArray): Int {
    var index = 1
    for(i in 1 until nums.size) {
        if(nums[i] != nums[i - 1]) {
            nums[index] = nums[i]
            index++
        }
    }
    return index
}
