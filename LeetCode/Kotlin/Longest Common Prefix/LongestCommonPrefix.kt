fun main() {
    val strs = arrayOf("cir","car")
    val result = longestCommonPrefix(strs)
    println(result)
}
fun longestCommonPrefix(strs: Array<String>): String {
    var prefix = ""
    var minlength = strs.minOf{ it.length }
    for(i in 0 until minlength) {
        prefix += strs[0][i]
        for(j in 1 until strs.size) {
            if(prefix.last() != strs[j][i]) {
                prefix = prefix.dropLast(1)
                return prefix
            }
        }
    }
    return prefix
}