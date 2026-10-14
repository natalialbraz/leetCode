package plans.programmingskills.p0389_find_the_difference

/**
 * 389. Find the Difference (Easy)
 * https://leetcode.com/problems/find-the-difference/
 *
 * Approach:
 *
 * Time:  O(?)
 * Space: O(?)
 */
class Solution {
    fun findTheDifference(s: String, t: String): Char {
        var result = 0

        // XOR all characters in s
        for (ch in s) {
            result = result xor ch.code
        }

        // XOR all characters in t
        for (ch in t) {
            result = result xor ch.code
        }

        return result.toChar()
    }
}