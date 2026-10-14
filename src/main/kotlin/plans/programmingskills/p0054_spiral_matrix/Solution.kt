package plans.programmingskills.p0054_spiral_matrix

/**
 * 54. Spiral Matrix (Medium)
 * https://leetcode.com/problems/spiral-matrix/
 *
 * Approach:
 *
 * Time:  O(?)
 * Space: O(?)
 */
class Solution {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        var initialRow = 0
        var finalRow = matrix.size - 1
        var initialCol = 0
        var finalCol = matrix[0].size - 1
        val spiralOrder = mutableListOf<Int>()
        while (initialRow <= finalRow && initialCol <= finalCol) {
            for (col in initialCol..finalCol) { // go right
                spiralOrder.add(matrix[initialRow][col])
            }
            initialRow++
            for (row in initialRow..finalRow) { // go down
                spiralOrder.add(matrix[row][finalCol])
            }
            finalCol--
            if (initialRow <= finalRow) {
                for (col in finalCol downTo initialCol) { // go left
                    spiralOrder.add(matrix[finalRow][col])
                }
                finalRow--
            }

            if (initialCol <= finalCol) {
                for (row in finalRow downTo initialRow) { // go up
                    spiralOrder.add(matrix[row][initialCol])
                }
                initialCol++
            }
        }

        return spiralOrder
    }
}