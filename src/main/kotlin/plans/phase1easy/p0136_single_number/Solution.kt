package plans.phase1easy.p0136_single_number

class Solution {
    fun singleNumber(nums: IntArray): Int {
        val unpaired = HashSet<Int>()
        for (n in nums) {
            if (!unpaired.remove(n)) unpaired.add(n)
        }
        return unpaired.first()
    }

}