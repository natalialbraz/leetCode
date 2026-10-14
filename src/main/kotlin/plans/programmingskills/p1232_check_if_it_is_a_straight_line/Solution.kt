package plans.programmingskills.p1232_check_if_it_is_a_straight_line

/**
 * 1232. Check If It Is a Straight Line (Easy)
 * https://leetcode.com/problems/check-if-it-is-a-straight-line/
 *
 * Approach:
 *
 * Time:  O(?)
 * Space: O(?)
 */
class Solution {
    fun checkStraightLine(coordinates: Array<IntArray>): Boolean {
        val cord1 = coordinates.first()
        val cord2 = coordinates[1]
        val x1 = cord1[0]
        val x2 = cord2[0]
        val y1 = cord1[1]
        val y2 = cord2[1]
        val dy1 = y2 - y1
        val dx1 = x2 - x1

        for (i in 2 until coordinates.size) {
            val dyi = coordinates[i][1] - y1
            val dxi = coordinates[i][0] - x1
            if (dy1 * dxi != dyi * dx1) return false
        }
        return true
    }
}