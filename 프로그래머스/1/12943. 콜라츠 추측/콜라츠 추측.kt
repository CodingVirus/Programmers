class Solution {
    fun solution(num: Int): Int {
        if (num == 1) return 0
        var answer: Long = num.toLong()
        var count: Long = 0L
        
        while (count <= 500L) {
            count++
            if (answer % 2L == 0L) {
                answer = answer / 2L
            } else {
                answer = answer * 3L + 1L
            }
            
            if (answer == 1L) {
                answer = count
                return answer.toInt()
            }
        }
        
        answer = -1L
        
        return answer.toInt()
    }
}