class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0
        var num: String = n.toString()
        var result: String = ""
        val charArray: CharArray = num.toCharArray()
        var intArray = IntArray(charArray.size)
    
        for (i in 0..(intArray.size-1)) {
            intArray[i] = charArray[i] - '0'
        }
    
        for (i in 0..(intArray.size-1)) {
            for (j in 0..(intArray.size-1)) {
                if (intArray[i] <intArray[j]) {
                    continue
                } else if (intArray[i] >intArray[j]) {
                    var store: Int = intArray[i]
                    intArray[i] = intArray[j]
                    intArray[j] = store
                }
            }
        }
        
        for (i in 0..(intArray.size-1)) {
            result += intArray[i]
        }
        
        answer = result.toLong()
        
        return answer
    }
}