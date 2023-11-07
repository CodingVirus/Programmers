class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = LongArray(n)
        
        for (i in 0..(n-1)) {
            if (i == 0) {
                answer[i] = x.toLong()
            } else {
                answer[i] = x.toLong() + answer[i-1]
            }
        }
        return answer
    }
}