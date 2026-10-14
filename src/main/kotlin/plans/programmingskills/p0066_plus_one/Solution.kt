package plans.programmingskills.p0066_plus_one

/**
 * 66. Plus One (Easy)
 * https://leetcode.com/problems/plus-one/
 *
 * Approach:
 *
 * Time:  O(?)
 * Space: O(?)
 */
class Solution {
    fun plusOne(digits: IntArray): IntArray {
        val default = IntArray(digits.size + 1).also { it[0] = 1 }
        for (i in digits.size-1 downTo 0) {
            when {
                digits[i] != 9 -> {
                    digits[i]++
                    break
                }

                digits[i] == 9 -> digits[i] = 0

            }
            if (i == 0) return default
        }
        return digits
    }

}