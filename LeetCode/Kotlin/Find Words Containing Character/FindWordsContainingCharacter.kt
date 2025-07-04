fun findWordsContaining(words: Array<String>, x: Char): List<Int> {
    var result = mutableListOf<Int>()
    for(i in words.indices) {
        for(j in words[i].indices) {
            if(words[i][j] == x) {
                result.add(i)
                break
            }
        }
    }
    return result
}

fun main() {
    val words = arrayOf("abc","bcd","aaaa","cbc")
    val x = 'a'
    val lists = findWordsContaining(words, x)
    lists.forEach{println(it)}
}