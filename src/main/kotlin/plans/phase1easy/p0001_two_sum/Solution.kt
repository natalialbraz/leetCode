package plans.phase1easy.p0001_two_sum

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var marker = 0
        val result = IntArray(2)
        while (marker <= nums.size) {
            for (i in marker + 1 until nums.size) {
                if (nums[marker] + nums[i] == target) {
                    result[0] = marker
                    result[1] = i
                }
            }
            marker++
        }
        return result
    }
}