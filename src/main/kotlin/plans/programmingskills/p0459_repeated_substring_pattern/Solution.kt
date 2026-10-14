package plans.programmingskills.p0459_repeated_substring_pattern

/**
 * 459. Repeated Substring Pattern (Easy)
 * https://leetcode.com/problems/repeated-substring-pattern/
 *
 * Approach:
 *
 * Time:  O(?)
 * Space: O(?)
 */
class Solution {
    fun repeatedSubstringPattern(s: String): Boolean {
        if (s.length <= 1) return false

        for (i in 1..s.length / 2) {
            if (s.length % i == 0) {
                val substring = s.substring(0, i)
                val repeated = substring.repeat(s.length / i)
                if (repeated == s) {
                    return true
                }
            }
        }

        return false
    }
}