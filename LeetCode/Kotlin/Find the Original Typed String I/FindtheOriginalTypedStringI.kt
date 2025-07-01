fun possibleStringCount(word: String): Int {
    var Count: Int = 1
    for(i in 0 until word.length - 1) {
        if(word[i] == word[i + 1]) {
            Count = Count + 1
        }
    }
    return Count
}
fun main() {
    var word: String = "abbcccc"
    print(possibleStringCount(word))
}