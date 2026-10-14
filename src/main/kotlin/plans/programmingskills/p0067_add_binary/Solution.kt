package plans.programmingskills.p0067_add_binary

import kotlin.math.max

/**
 * 67. Add Binary (Easy)
 * https://leetcode.com/problems/add-binary/
 *
 * Approach:
 *
 * Time:  O(?)
 * Space: O(?)
 */
class Solution {
    fun addBinary(a: String, b: String): String {
        var carry = 0
        var result = ""
        var bI = b.length - 1
        var aI = a.length - 1

        for (iMax in max(aI, bI) downTo 0) {
            val firstTerm = if (aI >= 0) a[aI] - '0' else 0
            val secondTerm = if (bI >= 0) b[bI] - '0' else 0
            val sum = firstTerm + secondTerm + carry
            val item = sum % 2
            carry = sum / 2
            result += ("$item")
            bI--
            aI--
        }
        if (carry != 0) result += "1"
        return result.reversed()
    }
}