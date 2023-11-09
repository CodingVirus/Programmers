class Solution {
    fun solution(x: Int): Boolean {
        var answer = true
        var result: Int = 0
    
        x.toString().toCharArray().map {
            result += it - '0'
        }

        if ((x % result) == 0) {
            answer = true;
        } else {
            answer = false;
        }
        return answer
    }
}