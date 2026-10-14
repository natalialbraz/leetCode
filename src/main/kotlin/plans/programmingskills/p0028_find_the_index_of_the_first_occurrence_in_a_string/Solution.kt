package plans.programmingskills.p0028_find_the_index_of_the_first_occurrence_in_a_string

/**
 * 28. Find the Index of the First Occurrence in a String (Easy)
 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
 *
 * Approach:
 *
 * Time:  O(?)
 * Space: O(?)
 */
class Solution {
    fun strStr(haystack: String, needle: String): Int {
        if (!haystack.contains(needle)) return -1

        return haystack.indexOf(needle)
    }
}