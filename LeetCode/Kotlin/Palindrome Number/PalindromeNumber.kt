fun main() {
    print(isPalindrome(-121))
}

fun isPalindrome(x: Int): Boolean {
    if(x<0){
        return false
    }
    else{
        var num = x
        val nums = mutableListOf<Int>()
        while(num > 0){
            nums.add(num % 10)
            num /= 10
        }
        for(i in 0 until nums.size / 2) {
            if(nums[i] != nums[nums.size - 1 - i]){
                return false
            }
        }
        return true
    }
}