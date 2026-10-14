package plans.programmingskills.p1572_matrix_diagonal_sum

/**
 * 1572. Matrix Diagonal Sum (Easy)
 * https://leetcode.com/problems/matrix-diagonal-sum/
 *
 * Approach:
 *
 * Time:  O(?)
 * Space: O(?)
 */
class Solution {
    fun diagonalSum(mat: Array<IntArray>): Int {
        var primaryDiagonal =0
        for (rowI in mat.indices) {
            for (colI in mat[rowI].indices)  {
                if (colI == rowI) primaryDiagonal += mat[rowI][colI]

            }
        }

        var secondaryDiagonal = 0

        for (rowI in mat.indices) {
            for (colI in mat[rowI].indices)  {
                if (colI == mat.size - 1 - rowI && colI != rowI) secondaryDiagonal += mat[rowI][colI]

            }
        }

        return primaryDiagonal + secondaryDiagonal
    }
}