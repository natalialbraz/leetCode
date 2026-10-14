package plans.programmingskills.p0073_set_matrix_zeroes

class Solution2 {
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

        // set entire rows to zero
        for (row in zeroRows) {
            for (col in matrix[row].indices) {
                matrix[row][col] = 0
            }
        }

        // set entire cols to zero
        for (col in zeroCols) {
            for (row in matrix.indices) {
                matrix[row][col] = 0
            }
        }
    }
}