package plans.phase1easy.p0217_contains_duplicate

class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val seen = HashSet<Int>()
        for (n in nums) {
            seen.add(n)
        }
        return seen.size != nums.size
    }
}