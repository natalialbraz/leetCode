package plans.topinterview150.p0055_jump_game

import kotlin.math.max

class Solution {
    fun canJump(nums: IntArray): Boolean {
        val arraySize = nums.size
        var maxReach = 0
        for (i in 0 until arraySize - 1) {
            if (i > maxReach) return false
            if (i == 0 && nums[i] == 0) return false
            maxReach = max(maxReach, nums[i] + i)
        }
        return maxReach >= nums.size - 1
    }
}