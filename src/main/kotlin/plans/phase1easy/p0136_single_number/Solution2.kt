package plans.phase1easy.p0136_single_number

class Solution2 {
    fun singleNumber(nums: IntArray): Int {
        var result = 0
        for (n in nums) {
            result = result xor n
        }
        return result
    }
}