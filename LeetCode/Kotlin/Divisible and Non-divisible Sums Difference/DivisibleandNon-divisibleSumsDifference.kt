fun differenceOfSums(n: Int, m: Int): Int {
    var num1: Int = 0
    var num2: Int = 0
    for(i in 0 .. n) {
        if(i % m == 0) {
            num2 += i
        }
        else {
            num1 += i
        }
    }
    return num1 - num2
}
fun main() {
    print(differenceOfSums(5, 1))
}