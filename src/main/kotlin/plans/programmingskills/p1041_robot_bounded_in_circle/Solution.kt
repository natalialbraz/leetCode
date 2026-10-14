package plans.programmingskills.p1041_robot_bounded_in_circle

/**
 * 1041. Robot Bounded In Circle (Medium)
 * https://leetcode.com/problems/robot-bounded-in-circle/
 *
 * Approach:
 *
 * Time:  O(?)
 * Space: O(?)
 */
class Solution {

    // test case: "GLGLGGLGL"
    fun isRobotBounded(instructions: String): Boolean {

        var position = Pair(0,0)
        var currentDirection = 0

        for (pass in instructions) {
            when (pass) {
                'G' -> {
                    position = changePosition(currentDirection, position)
                }
                'L' -> currentDirection = changeDirection(currentDirection, pass)
                'R' -> currentDirection = changeDirection(currentDirection, pass)
            }
        }



        return position == Pair(0,0) || currentDirection != 0
    }

    fun changePosition(currentDirection: Int, position: Pair<Int, Int>) : Pair<Int, Int> {
        return when (currentDirection) {
            0 -> Pair(position.first, position.second + 1)
            1 ->  Pair(position.first +1 , position.second)
            2 ->  Pair(position.first, position.second -1)
            3 ->  Pair(position.first - 1, position.second)
            else -> Pair(0,0)
        }
    }

    fun changeDirection(currentDirection: Int, pass: Char) : Int {
        return when (currentDirection) {
            0 -> if (pass == 'L') 3 else 1
            1 -> if (pass == 'L') 0 else 2
            2 -> if (pass == 'L') 1 else 3
            3 -> if (pass == 'L') 2 else 0
            else -> -1
        }
    }
}