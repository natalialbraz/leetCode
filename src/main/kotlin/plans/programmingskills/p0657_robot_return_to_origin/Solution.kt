package plans.programmingskills.p0657_robot_return_to_origin

/**
 * 657. Robot Return to Origin (Easy)
 * https://leetcode.com/problems/robot-return-to-origin/
 *
 * Approach:
 *
 * Time:  O(?)
 * Space: O(?)
 */
class Solution {
    fun judgeCircle(moves: String): Boolean {
        var horizontalSum = 0
        var verticalSum = 0
        for (move in moves) {
            when (move) {
                'R' -> horizontalSum++
                'L' -> horizontalSum--
                'U' -> verticalSum++
                'D' -> verticalSum--
            }
        }
        return verticalSum == 0 && horizontalSum == 0
    }
}