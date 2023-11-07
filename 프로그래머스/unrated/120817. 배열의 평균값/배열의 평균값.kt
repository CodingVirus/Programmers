class Solution {
    fun solution(numbers: IntArray): Double {
        var answer: Double = 0.0
    
        for (i in 0..(numbers.size - 1)) {
            answer = answer + numbers[i].toDouble()
        }
        
        answer = answer / numbers.size
    
        return answer
    }
}