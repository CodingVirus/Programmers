class Solution {
    fun solution(s: String): String {
        var answer = ""
        
        var num = s.length / 2
        
        if (s.length % 2 == 0) {
            answer += s[num-1]
            answer += s[num]
        } else { 
            answer += s[num]
        }
        
        return answer
    }
}