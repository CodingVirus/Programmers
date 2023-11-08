class Solution {
    fun solution(n: Long): IntArray {
        
        var changeString: String = n.toString()
        var answer = IntArray(changeString.length)
        
        
        for (i in (answer.size-1) downTo 0) {
            answer[answer.size - (i+1)] = changeString[i] - '0'
        }
        
        return answer
    }
}