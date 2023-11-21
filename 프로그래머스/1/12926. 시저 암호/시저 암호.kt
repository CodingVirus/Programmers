class Solution {
    fun solution(s: String, n: Int): String {
        var answer = ""
        
        var chr = 'a'
    
        for (i in 0..s.length-1) {
            if (s[i] == ' ') answer += ' '
            else {
                chr = s[i]
                for (j in 1..n) { 
                    chr += 1
                    if (chr == 'z' + 1) chr = 'a'
                    if (chr == 'Z' + 1) chr = 'A'
                } 
                answer += chr
            }
        }

        return answer
    }
}