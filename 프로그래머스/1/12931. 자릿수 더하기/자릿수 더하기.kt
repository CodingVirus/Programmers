class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        var maxN = 1000000000
        var myNum = n
        
        while(maxN > 0) {
            var test = myNum / maxN
            answer = answer + test
            myNum = myNum - test * maxN
            maxN = maxN / 10
        }
        

        return answer
    }
}