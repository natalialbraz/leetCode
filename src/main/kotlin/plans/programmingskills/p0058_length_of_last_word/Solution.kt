package plans.programmingskills.p0058_length_of_last_word

/**
 * 58. Length of Last Word (Easy)
 * https://leetcode.com/problems/length-of-last-word/
 *
 * Approach:
 *
 * Time:  O(?)
 * Space: O(?)
 */
class Solution {
    fun lengthOfLastWord(s: String): Int {
        var count = 0
        for (indice in s.lastIndex downTo 0) {
            if (s[indice] == ' ' && count > 0) break
            if (s[indice] != ' ') count++
        }
        return count
    }
}