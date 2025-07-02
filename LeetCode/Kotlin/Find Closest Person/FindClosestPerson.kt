import kotlin.math.*
fun findClosest(x: Int, y: Int, z: Int): Int {
    if(abs(x-z) < abs(y-z)) {
        return 1
    }
    else if(abs(x-z) > abs(y-z)) {
        return 2
    }
    return 0
}
fun main() {
    print(findClosest(2,7,4))
}