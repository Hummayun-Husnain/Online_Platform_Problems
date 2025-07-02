fun maxProduct(n: Int): Int {
    var result: Int = 0
    var num = n
    var arr = mutableListOf<Int>()
    while(num > 0) {
        arr.add(num%10)
        num/=10
    }
    for(i in 0 until arr.size) {
        for(j in i + 1 until arr.size) {
            if(arr[i]*arr[j] > result) {
                result = arr[i]*arr[j]
            }
        }
    }
    return result
}
fun main() {
    print(maxProduct(143))
}