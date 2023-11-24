class Solution {
    fun solution(s: String): IntArray {
        var list = mutableListOf<Int>()
        var position = 0

        for (i in 0..s.length-1) {
            for (j in 0..i-1) {
                if (s[i] == s[j]) {
                    position = i-j
                }
            }
            if (position > 0) list.add(position)
            else list.add(-1)
            position = 0
        }
        var answer = list.toIntArray()
        return answer
    }
}