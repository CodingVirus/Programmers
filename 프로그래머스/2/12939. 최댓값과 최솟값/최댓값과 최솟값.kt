class Solution {
    fun solution(s: String): String {
        var answer = ""
        var max = 0
        var min = 0

        var test = s.split(" ").map{it.toInt()}

        for (i in test.indices) {
            if (i == 0) {
                max = test[i]
                min = test[i]
            }
            if (max < test[i]) max = test[i]
            else if (min > test[i]) min = test[i]
        }

        answer = answer + min
        answer = answer + " "
        answer = answer + max
        
        return answer
    }
}