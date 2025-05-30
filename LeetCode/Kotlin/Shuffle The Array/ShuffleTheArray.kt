fun main() {
    val n = 3
    val nums = intArrayOf(2, 5, 1, 3, 4, 7)
    val numb = shuffle(nums,n)
    for(i in numb.indices) {
        println(numb[i])
    }
}

fun shuffle(nums: IntArray, n: Int): IntArray {
    var numb =  IntArray(nums.size)
    for(i in 0 until nums.size / 2) {
        numb[2*i] = nums[i]
        numb[2*i+1] = nums[n+i]
    }
    return numb
}