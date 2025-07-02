fun sumOfTheDigitsOfHarshadNumber(x: Int): Int {
    var result: Int = 0
    var num: Int = x
    while(num > 0) {
        result += num%10
        num /= 10
    }
    if(x%result != 0) {
        result = -1
    }
    return result
}
fun main() {
    print(sumOfTheDigitsOfHarshadNumber(23))
}