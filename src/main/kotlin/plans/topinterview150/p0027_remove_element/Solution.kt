package plans.topinterview150.p0027_remove_element

/**
 * 27. Remove Element (Easy)
 * https://leetcode.com/problems/remove-element/
 *
 * Approach:
 *
 * Time:  O(?)
 * Space: O(?)
 */
class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var k = 0

        for (i in nums.indices) {
            if (nums[i] != `val`) {
                nums[k] = nums[i]
                k++
            }
        }

        return k
    }
}