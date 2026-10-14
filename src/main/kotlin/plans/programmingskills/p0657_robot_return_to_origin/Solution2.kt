package plans.programmingskills.p0657_robot_return_to_origin

class Solution2 {
    fun judgeCircle(moves: String): Boolean {
        var horizontalSum = 0 // pair of vertical, horizontal moves
        var verticalSum = 0
        for (i in moves.indices) {
            when (moves[i]) {
                'R' -> horizontalSum += 1
                'L' -> horizontalSum -= 1
                'U' -> verticalSum += 1
                'D' -> verticalSum -= 1
            }
        }
        return verticalSum == 0 && horizontalSum == 0
    }
}