import kotlin.math.abs
fun scoreOfString(s: String): Int {
    var result: Int = 0
    for(i in 0 until s.length - 1) {
        result += abs(s[i] - s[i + 1])
    }
    return result
}
fun main() {
    val s: String = "hello"
    print(scoreOfString(s))
}