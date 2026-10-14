package plans.programmingskills.p0896_monotonic_array

/**
 * 896. Monotonic Array (Easy)
 * https://leetcode.com/problems/monotonic-array/
 *
 * Approach:
 *
 * Time:  O(?)
 * Space: O(?)
 */
class Solution {
    fun isMonotonic(nums: IntArray): Boolean {

        var isIncreasing = true

        for( i in 0 until  nums.size-1) {
            if (nums[i] > nums[i+1]) isIncreasing = false
        }

        for( i in 0 until  nums.size-1) {
            if (!isIncreasing &&  nums[i] < nums[i+1]) return false
        }

        return true
    }
}