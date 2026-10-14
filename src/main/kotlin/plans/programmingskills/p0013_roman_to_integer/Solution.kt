package plans.programmingskills.p0013_roman_to_integer

/**
 * 13. Roman to Integer (Easy)
 * https://leetcode.com/problems/roman-to-integer/
 *
 * Approach: walk left to right; if a symbol is smaller than the one after it
 * (IV, IX, XL...), subtract it, otherwise add it.
 *
 * Time:  O(n)
 * Space: O(1)
 */
class Solution {
    fun romanToInt(s: String): Int {
        var sum = 0
        for (index in s.indices) {

            val next = if (index != s.lastIndex) {
                convertRoman(s[index + 1])
            } else {
                0
            }
            val current = convertRoman(s[index])
            if (current < next) {
                sum -= current
            } else {
                sum += current
            }
        }
        return sum
    }

    fun convertRoman(roman: Char): Int {
        return when (roman) {
            'I' -> 1
            'V' -> 5
            'X' -> 10
            'L' -> 50
            'C' -> 100
            'D' -> 500
            'M' -> 1000
            else -> 0
        }
    }
}
