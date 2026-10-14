package plans.programmingskills.p0073_set_matrix_zeroes

/**
 * 73. Set Matrix Zeroes (Medium)
 * https://leetcode.com/problems/set-matrix-zeroes/
 *
 * Approach:
 *
 * Time:  O(?)
 * Space: O(?)
 */
class Solution {
    fun setZeroes(matrix: Array<IntArray>): Unit {
        val zeroRows = mutableListOf<Int>()
        val zeroCols = mutableListOf<Int>()
        for (row in matrix.indices) {
            for (col in matrix[row].indices) {
                if (matrix[row][col] == 0) {
                    zeroRows.add(row)
                    zeroCols.add(col)
                }
            }
        }
        var j = 0
        while (j <= zeroRows.size-1) {
            for (row in matrix.indices) {
                for (col in matrix[row].indices) {
                    if (row == zeroRows[j]) matrix[row][col] = 0
                    if (col == zeroCols[j]) matrix[row][col] = 0
                }
            }
            j++
        }
    }
}