package plans.programmingskills.p1768_merge_strings_alternately

class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        val result = StringBuilder()
        val maxLength = maxOf(word1.length, word2.length)

        for (i in 0 until maxLength) {
            // Add character from word1 if available
            if (i < word1.length) {
                result.append(word1[i])
            }
            // Add character from word2 if available
            if (i < word2.length) {
                result.append(word2[i])
            }
        }

        return result.toString()
    }
}