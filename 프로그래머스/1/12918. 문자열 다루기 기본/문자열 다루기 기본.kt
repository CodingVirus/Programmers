class Solution {
    fun solution(s: String): Boolean {
        
        if (s.length == 4 || s.length == 6) {
            return try {
                    s.toInt()
                    true
                } catch(e: NumberFormatException) {
                    false
                } 
        } else {
            return false
        }
    }
}