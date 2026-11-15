package plans.phase1easy.p0219_contains_duplicate_2

class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val frequency = HashMap<Int, Int>()
        for (i in nums.indices) {
            val previous = frequency.put(nums[i], i)
            if (previous != null && i - previous <= k) {
                return true
            }
        }
        return false
    }
}