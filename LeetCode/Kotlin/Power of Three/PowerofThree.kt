fun isPowerOfThree(n: Int): Boolean {
    if(n > 0 && 1162261467 % n == 0) {
        return true
    }
    else {
        return false
    }
}
fun main() {
    print(isPowerOfThree(81))
}