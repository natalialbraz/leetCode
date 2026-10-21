package plans.phase1easy.p0035_search_insert_position

class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        for (i in 0 until nums.size) {
            if (nums[i] == target) return i
            if (nums[i] > target) return i
        }
        return nums.size
    }
}