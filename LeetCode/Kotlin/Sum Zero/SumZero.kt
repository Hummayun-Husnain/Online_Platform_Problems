fun main() {
    val a = sumZero(5)
    a.forEach { println(it) }
    val b = sumZero(4)
    b.forEach { println(it) }
    val c = sumZero(1)
    c.forEach { println(it) }
}
fun sumZero(n: Int): IntArray {
    var nums = IntArray(n)
    for(i in 0 until n/2){
        nums[i] = i + 1
        nums[n - i - 1] = -(i + 1)
    }
    if(n % 2 != 0) {
        nums[n / 2] = 0
    }
    return nums
}