package prob1560

import kotlin.math.max

class Solution {
    fun mostVisited(n: Int, rounds: IntArray): List<Int> {
        val visited = IntArray(n)
        var maxVisited = 0
        var sr = rounds[0] - 1
        for (i in 1 until rounds.size) {
            val er = rounds[i] % n
            while (sr != er) {
                visited[sr]++
                maxVisited = max(maxVisited, visited[sr])
                sr = (sr + 1) % n
            }
        }
        val ret = ArrayList<Int>();
        for (i in visited.indices) {
            if (visited[i] == maxVisited)
                ret.add(i + 1)
        }
        return ret
    }
}