class Solution {
    fun solution(arr: IntArray): IntArray {
        
        var copyArr = arr.copyOf()
        copyArr.sort()

        if (copyArr.size == 1) { }

        var answer = arr.filter { it > copyArr[0] }.toIntArray()
        
        return answer
    }
}