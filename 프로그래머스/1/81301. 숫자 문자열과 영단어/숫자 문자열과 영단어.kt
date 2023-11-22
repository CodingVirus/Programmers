class Solution {
    fun solution(s: String): Int {
        var copyString = s
        var numMap = mapOf("zero" to "0", "one" to "1", "two" to "2", "three" to "3", "four" to "4", 
                           "five" to "5", "six" to "6", "seven" to "7", "eight" to "8", "nine" to "9")
        
        var result = numMap.filter {
            copyString.contains(it.key) == true
            }.map {copyString = copyString.replace(it.key, it.value)}
        var answer = copyString.toInt()
        return answer
    }
}