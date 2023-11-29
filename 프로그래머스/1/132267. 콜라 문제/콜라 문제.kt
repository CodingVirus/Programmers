class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0
        
        var receive = a
        var give = b
        var possession = n
        var c = 0
    
        while (possession >= receive) {

            if (possession % receive > 0) {
               c = possession % receive
               possession = (possession / receive) * give
               answer += possession
               possession += c
            }
            else if (possession % receive == 0) {
                possession = (possession / receive) * give
                answer += possession
            }
        }
        return answer
    }
}