package plans.topinterview150.p0088_merge_sorted_array

/**
 * 88. Merge Sorted Array (Easy)
 * https://leetcode.com/problems/merge-sorted-array/
 *
 * Approach:
 *
 * Time:  O(?)
 * Space: O(?)
 */
class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        nums1.take(m).plus(nums2.take(n))
            .sorted().toIntArray().copyInto(nums1)
        println(nums1)
    }
}