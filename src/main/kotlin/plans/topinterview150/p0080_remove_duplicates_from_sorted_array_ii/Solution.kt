package plans.topinterview150.p0080_remove_duplicates_from_sorted_array_ii

/**
 * 80. Remove Duplicates from Sorted Array II (Medium)
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 *
 * Approach:
 *
 * Time:  O(?)
 * Space: O(?)
 */
class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.size <= 2) return nums.size  // Edge case

        var k = 2  // First 2 elements are always valid

        // [1,1,1,2,2,3]
        for (i in 2 until nums.size) {
            // Only place if different from element 2 positions back
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i]
                k++
            }
        }

        return k
    }
}