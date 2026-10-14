package plans.programmingskills.p0896_monotonic_array

class Solution2 {
    fun isMonotonic(nums: IntArray): Boolean {

        var isIncreasing = false
        var isDecreasing = false

        for( i in 0 until  nums.size-1) {
            if (nums[i] < nums[i+1]) isIncreasing = true
            if (nums[i] > nums[i+1]) isDecreasing = true
        }


        return !(isIncreasing && isDecreasing)
    }
}