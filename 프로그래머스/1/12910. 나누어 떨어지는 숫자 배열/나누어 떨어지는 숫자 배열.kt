class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = arr.filter { it % divisor == 0 }.sorted().toIntArray()
        if (answer.size == 0) {
            var result = intArrayOf(-1)
            answer = result.copyOf()
        }
        return answer
    }
}