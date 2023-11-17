class Solution {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        var str = ""
        
        for (i in 0..(t.length-(p.length-1)-1)) {
            for (j in i..(p.length + i - 1)) {
                str += t[j]
            }
            if (str.toLong() <= p.toLong()) {
                answer++
                str = ""
            } else {
                str = ""
            }
        }
        return answer
    }
}