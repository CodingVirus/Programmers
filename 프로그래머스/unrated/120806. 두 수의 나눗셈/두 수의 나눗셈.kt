class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = 0
        
        var changeNum1 = num1.toFloat()
        var changeNum2 = num2.toFloat()
        var result: Float = changeNum1 / changeNum2 * 1000
    	
        answer = result.toInt()
        
        return answer
    }
}