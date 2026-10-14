package plans.programmingskills.p0976_largest_perimeter_triangle

/**
 * 976. Largest Perimeter Triangle (Easy)
 * https://leetcode.com/problems/largest-perimeter-triangle/
 *
 * Approach:
 *
 * Time:  O(?)
 * Space: O(?)
 */
class Solution {
    fun largestPerimeter(nums: IntArray): Int {
        val descendingCopy = nums.sortedArrayDescending()
        for (i in 0 until  descendingCopy.size-2) {
            if (descendingCopy[i] < descendingCopy[i+1]+descendingCopy[i+2]){
                return descendingCopy[i] + descendingCopy[i+1]+descendingCopy[i+2]
            }
        }
        return 0
    }
}