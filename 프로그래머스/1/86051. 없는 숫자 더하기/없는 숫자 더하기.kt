class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 0  
        var sum: Int = 0

        for (i in 0..9) {
            sum += i
        }

        numbers.forEach { answer += it }
        answer = sum - answer
       
        return answer
    }
}