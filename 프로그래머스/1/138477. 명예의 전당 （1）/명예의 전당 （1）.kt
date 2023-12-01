class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        
        var list = ArrayList<Int>()
        var result = ArrayList<Int>()
    
        for (i in score.indices) {
            if (i < k) {
                list.add(score[i])
                list.sort()
                result.add(list[0])
            } else {
                if (score[i] > list[0]) {
                    list[0] = score[i]
                    list.sort()
                    result.add(list[0])
                } else {
                    result.add(list[0])
                }
            }
        }
        var answer = result.toIntArray()
        return answer
    }
}