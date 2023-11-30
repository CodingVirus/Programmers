class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        val result = mutableListOf<Int>()
        var store = mutableListOf<Int>()

        for (i in commands.indices) {
            for (j in commands[i][0] - 1..commands[i][1] - 1) {
                store.add(array[j])
            }
            store.sort()
            result.add(store[commands[i][2]-1])
            store.clear()
        }
        var answer = result.toIntArray()
        return answer
    }
}