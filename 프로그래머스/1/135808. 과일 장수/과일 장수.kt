class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        var resultList = ArrayList<Int>()
    
        score.sort()

        for (j in score.size%m..score.size-1 step m) {
            resultList.add(score[j])
        }
        
        answer = resultList.sum() * m
        return answer
    }
}