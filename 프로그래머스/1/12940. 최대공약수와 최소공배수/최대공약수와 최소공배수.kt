class Solution {
    fun solution(n: Int, m: Int): IntArray {
        var answer = IntArray(2)
        
        for (i in 1..m) {
            if (n % i == 0 && m % i == 0) {
                var result = (n / i) * (m / i) * i
                answer[0] = i
                answer[1] = result
            }
        }
        return answer
    }
}