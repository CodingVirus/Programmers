class Solution {
    fun solution(phone_number: String): String {
        var answer: String = phone_number
        
        var test = phone_number.substring(phone_number.length-4, phone_number.length)
        
        var test2: String = ""

        for (i in 0..phone_number.length-5) {
            test2 += '*'
        }

        answer = test2 + test
        
        return answer
    }
}