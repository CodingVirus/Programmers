class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        
        for (i in 1..n) {
            if (i % 2 == 0) {
                answer = answer + i
            }
        }
        
        return answer
    }
}