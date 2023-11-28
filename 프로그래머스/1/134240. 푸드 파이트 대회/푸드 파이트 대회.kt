class Solution {
    fun solution(food: IntArray): String {
        var answer: String = ""
        var str = ""
    
        for (i in 1..food.size-1) {
            for (j in 0..food[i]/2 - 1) {
                str += i
            }
        }

        answer = str.reversed()
        str += 0
        answer = str + answer
        
        return answer
    }
}