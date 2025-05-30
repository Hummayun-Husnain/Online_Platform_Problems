fun main() {
    val nums = intArrayOf(0)
    val value = 2
    println(removeElement(nums,value))
}
fun removeElement(nums: IntArray, `val`: Int): Int {
    var index = 0
    for(i in nums.indices) {
        if(`val` != nums[i]) {
            nums[index] = nums[i]
            index++
        }
    }
    return index
}