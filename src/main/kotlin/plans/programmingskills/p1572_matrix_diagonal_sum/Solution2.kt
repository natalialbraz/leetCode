package plans.programmingskills.p1572_matrix_diagonal_sum

class Solution2 {
    fun diagonalSum(mat: Array<IntArray>): Int {
        var primaryDiagonal = 0
        var secondaryDiagonal = 0
        for (i in mat.indices) {
            primaryDiagonal += mat[i][i]
            secondaryDiagonal += mat[i][mat.size-1-i]
        }

        var sum = primaryDiagonal + secondaryDiagonal
        if (mat.size % 2 != 0) {
            sum -= mat[mat.size / 2][mat.size / 2]
        }
        return sum
    }
}