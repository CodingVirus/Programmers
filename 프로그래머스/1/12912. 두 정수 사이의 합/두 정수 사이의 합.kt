class Solution {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0
        var start: Int = 0
        var end: Int = 0

        if (a > b) {
            start = b
            end = a
        } else if (a < b) {
            start = a
            end = b
        } else {
            answer = a.toLong()
        }

        for (i in start..end) {
            answer += i
        }
    
        return answer
    }
}