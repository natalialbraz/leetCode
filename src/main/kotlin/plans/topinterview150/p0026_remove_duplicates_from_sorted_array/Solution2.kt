package plans.topinterview150.p0026_remove_duplicates_from_sorted_array

class Solution2 {
    fun removeDuplicates(nums: IntArray): Int {
        var k = 0

        for (i in nums.indices) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                nums[k] = nums[i]
                k++
            }
        }

        return k

    }
}