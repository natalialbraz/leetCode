package plans.programmingskills.p0050_powx_n

/**
 * 50. Pow(x, n) (Medium)
 * https://leetcode.com/problems/powx-n/
 *
 * Approach:
 *
 * Time:  O(?)
 * Space: O(?)
 */
class Solution {
    fun myPow(x: Double, n: Int): Double {
        return pow(x, n.toLong()) // convert to Long immediately!
    }

    fun pow(x: Double, n: Long): Double {
        if (n == 0L) return 1.0
        if (n < 0) return 1.0 / pow(x, -n) // -n is safe now with Long!
        return if (n % 2 == 0L) pow(x * x, n / 2) else x * pow(x * x, n / 2)
    }
}