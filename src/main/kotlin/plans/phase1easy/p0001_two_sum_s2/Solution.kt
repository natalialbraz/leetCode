package plans.phase1easy.p0001_two_sum_s2

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val seen = HashMap<Int, Int>()

        for (i in nums.indices) {
            val complement = target - nums[i]
            if (seen.containsKey(complement)) {
                return intArrayOf(seen[complement]!!, i)
            }
            seen[nums[i]] = i
        }
        return intArrayOf()
    }
}