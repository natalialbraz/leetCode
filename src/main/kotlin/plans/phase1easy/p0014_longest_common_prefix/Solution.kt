package plans.phase1easy.p0014_longest_common_prefix

class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        val result = StringBuilder()
        var j = 0
        val minLength = strs.minOf { it.length }

        while (j < minLength) {
            for (i in 0 until strs.size) {
                if (strs[i][j] != strs[0][j]) {
                    return result.toString()
                }
            }
            result.append(strs[0][j])
            j++
        }
        return result.toString()
    }
}