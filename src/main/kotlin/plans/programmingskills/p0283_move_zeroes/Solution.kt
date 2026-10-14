package plans.programmingskills.p0283_move_zeroes

/**
 * 283. Move Zeroes (Easy)
 * https://leetcode.com/problems/move-zeroes/
 *
 * Approach:
 *
 * Time:  O(?)
 * Space: O(?)
 */
class Solution {
    fun moveZeroes(nums: IntArray): Unit {

        var k = 0
        val initialSize = nums.size

        for (n in 0 until initialSize) {
            if (nums[n] != 0) {
                nums[k] = nums[n]
                k++
            }
        }

        return nums.fill(0, k, initialSize)

    }
}