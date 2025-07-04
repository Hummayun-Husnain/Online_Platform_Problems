fun selfDividingNumbers(left: Int, right: Int): List<Int> {
    var result = mutableListOf<Int>()
    for(i in left..right) {
        var num = i
        var isSelfDividing = false
        while(num > 0) {
            if(num%10 != 0 && i%(num%10) == 0) {
                isSelfDividing = true
            }
            else {
                 isSelfDividing = false
                 break
            }
            num /= 10
        }
        if(isSelfDividing) {
            result.add(i)
        }
    }
    return result
}

fun main() {
    val lists = selfDividingNumbers(47, 85)
    lists.forEach{println(it)}
}