fun isPowerOfTwo(n: Int): Boolean {
    if(n.and(n - 1) == 0 && n > 0) {
        return true
    }
    else {
        return false
    }
}
fun main() {
    print(isPowerOfTwo(1))
}