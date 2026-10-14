package plans.programmingskills.p0242_valid_anagram

/**
 * 242. Valid Anagram (Easy)
 * https://leetcode.com/problems/valid-anagram/
 *
 * Approach:
 *
 * Time:  O(?)
 * Space: O(?)
 */
class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length ) return false

        val map = mutableMapOf<Char, Int>()
        for (value in s) {
            val count = map.getOrDefault(value, 0)
            map[value] = count + 1
        }
        for (value in t) {
            val count = map.getOrDefault(value, 0)
            if (count == 0) return false
            map[value] = count - 1
        }

        return map.values.all { it == 0 }

    }
}