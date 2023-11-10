class Solution {
    fun solution(arr: IntArray): IntArray {
        
        var answer = if (arr.size == 1) { arrayOf(-1).toIntArray() } 
        else arr.filter { it > arr.minOrNull()!! }.toIntArray()
        
        return answer
    }
}