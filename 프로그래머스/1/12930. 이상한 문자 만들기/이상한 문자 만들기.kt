class Solution {
    fun solution(s: String): String {
        var answer = ""
        
        var str = s.split(" ")
        var mystr = ""
    
        for (i in str.indices) {      
            for (j in str[i].indices) {
                if (j % 2 == 0) {
                    answer += str[i][j].toUpperCase()
                } else {
                    answer += str[i][j].toLowerCase()
                }
            }
            if (i == str.size-1) break
            answer += " "
        }

        return answer
    }
}