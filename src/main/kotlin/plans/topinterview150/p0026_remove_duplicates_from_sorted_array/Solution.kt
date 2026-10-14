package plans.topinterview150.p0026_remove_duplicates_from_sorted_array

/**
 * 26. Remove Duplicates from Sorted Array (Easy)
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 *
 * Approach:
 *
 * Time:  O(?)
 * Space: O(?)
 */
class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var k = 0

        for (i in nums.indices) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                nums[k] = nums[i]
                k++
            }
        }

        return k

    }
}