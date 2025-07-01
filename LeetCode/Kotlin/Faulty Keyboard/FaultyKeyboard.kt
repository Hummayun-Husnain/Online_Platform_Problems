fun finalString(s: String): String {
    var result: String = ""
    for(i in 0 .. s.length - 1) {
        if(s[i] != 'i') {
            result += s[i]
        }
        else {
            result = result.reversed()
        }
    }
    return result
}
fun main() {
    val s: String = "string"
    print(finalString(s))
}