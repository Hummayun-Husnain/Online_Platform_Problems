fun main() {
    val haystack = "sadbutsad"
    val needle = "sad"
    println(strStr(haystack,needle))
}
fun strStr(haystack: String, needle: String): Int {
    return haystack.indexOf(needle)
}