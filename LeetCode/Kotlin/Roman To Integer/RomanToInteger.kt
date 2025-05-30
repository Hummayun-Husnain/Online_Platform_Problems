fun main() {
    print(romanToInt("MCMXCIV"))
}

fun romanToInt(s: String): Int {
    val roman = IntArray(256)
    roman['I'.code] = 1
    roman['V'.code] = 5
    roman['X'.code] = 10
    roman['L'.code] = 50
    roman['C'.code] = 100
    roman['D'.code] = 500
    roman['M'.code] = 1000

    var num = 0
    var prev = 0
    for (i in s.length - 1 downTo 0) {
        val curr = roman[s[i].code]
        if (curr < prev) num -= curr else num += curr
        prev = curr
    }
    return num
}
