package plans.programmingskills.p0682_baseball_game

/**
 * 682. Baseball Game (Easy)
 * https://leetcode.com/problems/baseball-game/
 *
 * Approach:
 *
 * Time:  O(?)
 * Space: O(?)
 */
class Solution {
    fun calPoints(operations: Array<String>): Int {

        var j = 0
        val record = mutableListOf<Int>()

        for (i in operations.indices) {

            when (operations[i]) {
                "+" -> {
                    record.add(j, record[j - 1] + record[j - 2])
                    j++
                }

                "D" -> {
                    record.add(j, record[j - 1] * 2)
                    j++
                }

                "C" -> {
                    record.removeAt(j - 1)
                    j -= 1
                }

                else -> if (operations[i].toIntOrNull() != null) {
                    record.add(j, operations[i].toInt())
                    j++
                }
            }
        }
        var sum = 0

        for (i in record.indices) {
            sum += record[i]
        }
        return sum

    }

}