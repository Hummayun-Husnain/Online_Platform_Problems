fun isSumEqual(firstWord: String, secondWord: String, targetWord: String): Boolean {
    val firstnum = wordToNum(firstWord)
    val secondnum = wordToNum(secondWord)
    val targetnum = wordToNum(targetWord)
    println(firstnum)
    println(secondnum)
    println(targetnum)
    if(firstnum + secondnum == targetnum) {
        return true
    }
    else {
        return false
    }
}
fun wordToNum(word: String): Int {
    var result = 0
    for(i in word.indices) {
        result = (result * 10) + (word[i].code - 'a'.code)
    }
    return result
}
fun main() {
    print(isSumEqual("j", "j", "bi"))
}