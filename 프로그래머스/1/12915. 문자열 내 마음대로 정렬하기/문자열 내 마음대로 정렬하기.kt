class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        var answer = arrayOf<String>()
        
        var result = strings.sortedWith(compareBy({it[n]}, {it}))
        answer = result.toTypedArray()
        return answer
    }
}