fun convertTemperature(celsius: Double): DoubleArray {
    var temp = DoubleArray(2)
    temp[0] = celsius + 273.15
    temp[1] = celsius * 1.80 + 32.00
    return temp
}
fun main() {
    var result = convertTemperature(32.0)
    result.forEach { println(it) }
}