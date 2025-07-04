fun main() {
    var bracketString = "([])"
    println(isValid(bracketString))
}
fun isValid(s: String): Boolean {
    var s1 = s
    if(s1.length%2 != 0) {
        return false
    }
    while(s1.length > 0) {
        if("()" in s1) {
            s1 = s1.replace("()", "")
        }
        else if("{}" in s1) {
            s1 = s1.replace("{}", "")
        }
        else if("[]" in s1) {
            s1 = s1.replace("[]", "")
        }
        else {
            return false
        }
    }
    return true
}