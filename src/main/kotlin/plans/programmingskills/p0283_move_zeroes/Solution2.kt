package plans.programmingskills.p0283_move_zeroes

class Solution2 {
    fun moveZeroes(nums: IntArray) {
        var k = 0

        for (n in nums.indices) {
            if (nums[n] != 0) {
                nums[k] = nums[n]
                k++
            }
        }

        nums.fill(0, k, nums.size)
    }
}