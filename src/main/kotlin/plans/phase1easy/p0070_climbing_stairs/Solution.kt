package plans.phase1easy.p0070_climbing_stairs

class Solution {
    fun climbStairs(n: Int): Int {
        if (n <= 2) return n
        var twoBack = 1
        var oneBack = 2

        for (step in 3..n) {
            val current = oneBack + twoBack
            twoBack = oneBack
            oneBack = current
        }
        return oneBack
    }
}