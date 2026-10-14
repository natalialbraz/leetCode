package plans.programmingskills.p0709_to_lower_case

/**
 * 709. To Lower Case (Easy)
 * https://leetcode.com/problems/to-lower-case/
 *
 * Approach:
 *
 * Time:  O(?)
 * Space: O(?)
 */
class Solution {
    fun toLowerCase(s: String): String {
        var newString = ""
        for (indice in s.indices) {
            newString += if (s[indice] in 'A'..'Z') {
                s[indice].lowercase()
            } else {
                s[indice]
            }
        }
        return newString
    }
}