fun maximumValue(strs: Array<String>): Int {
    var result = 0
    var isInt = false
    for(i in strs.indices) {
        for(j in strs[i].indices) {
            if(strs[i][j] <= 'z' && strs[i][j] >= 'a') {
                if(result < strs[i].length) {
                    result = strs[i].length
                }
                isInt = false
                break
            }
            else {
                isInt = true
            }
        }
        if(isInt) {
            if(result < strs[i].toInt()) {
                result = strs[i].toInt()
            }
        }
    }
    return result
}
fun main() {
    val strs = arrayOf("3e","bob","3","4","00000")
    print(maximumValue(strs))
}