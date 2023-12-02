class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var answer: String = "Yes"
        var first = 0
        var second = 0
        
        for (i in goal.indices) {
            if (goal[i] == cards1[first]){
                if (first == cards1.size-1) continue
                else first++
            } else {
                if (goal[i] == cards2[second]) {
                    if (second == cards2.size-1) continue
                    else second++
                } else {
                    answer = "No"
                }
            }
        }
        return answer
    }
}