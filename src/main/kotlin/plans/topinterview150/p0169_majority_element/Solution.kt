package plans.topinterview150.p0169_majority_element

/**
 * 169. Majority Element (Easy)
 * https://leetcode.com/problems/majority-element/
 *
 * Approach:
 *
 * Time:  O(?)
 * Space: O(?)
 */
class Solution {
    fun majorityElement(nums: IntArray): Int {
        var k = 0
        var count = 1

        while (count < nums.size.toDouble() / 2) {
            k++
            count = 1

            for (i in nums.indices) { //[6,5,5]
                if (nums[k] == nums[i] && k != i) {
                    count++
                }
            }
        }
        return nums[k]
    }
}