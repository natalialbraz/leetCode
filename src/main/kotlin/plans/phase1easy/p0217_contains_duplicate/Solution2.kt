package plans.phase1easy.p0217_contains_duplicate

class Solution2 {
    fun containsDuplicate(nums: IntArray): Boolean {
        return nums.toSet().size != nums.size
    }
}