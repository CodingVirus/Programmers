class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var answer: Long = -1
        var pay: Long = 0
        
        for (i in 1..count) {
            pay += i * price    
        }
        
        if (pay >= money) { answer = pay - money }
        else { answer = 0 }
        
        return answer
    }
}