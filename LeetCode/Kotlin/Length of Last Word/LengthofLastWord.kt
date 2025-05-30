fun main() {
    val s = "   fly me   to   the moon  "
    println(lengthOfLastWord(s))
}

fun lengthOfLastWord(s: String): Int {
    var result = 0
    for(i in s.length - 1 downTo 0) {
        if(s[i] != ' ') {
            result += 1
        }
        else {
            if(result > 0) {
                break
            }
        }
    }
    return result
}