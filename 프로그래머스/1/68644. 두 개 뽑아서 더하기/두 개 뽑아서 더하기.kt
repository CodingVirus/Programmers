class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        
        var list = mutableListOf<Int>()
    
        for (i in 0..numbers.size-1) {
            for (j in 0..numbers.size-1) {
                if (i == j) continue
                list.add(numbers[i] + numbers[j])
            }
        }
        list.sort()
        answer = list.distinct().toIntArray()
        
        return answer
    }
}