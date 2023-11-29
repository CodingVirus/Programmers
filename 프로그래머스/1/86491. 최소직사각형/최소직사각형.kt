class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var answer: Int = 0
        
        var max = 0
        var min = 0

        for (i in sizes.indices) {
            if (sizes[i][0] > sizes[i][1]) {
                if (i == 0) {
                    max = sizes[i][0]
                    min = sizes[i][1]
                    continue
        	    } 
                if (sizes[i][0] > max) max = sizes[i][0]
                if (sizes[i][1] > min) min = sizes[i][1]
            } else {
                if (i == 0) {
                    max = sizes[i][1]
                    min = sizes[i][0]
                    continue
        	    }
                if (sizes[i][1] > max) max = sizes[i][1]
                if (sizes[i][0] > min) min = sizes[i][0]
            }
        }

        answer = max * min
        
        return answer
    }
}