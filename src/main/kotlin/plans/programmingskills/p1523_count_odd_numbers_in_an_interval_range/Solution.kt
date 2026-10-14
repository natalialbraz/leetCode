package plans.programmingskills.p1523_count_odd_numbers_in_an_interval_range

/**
 * 1523. Count Odd Numbers in an Interval Range (Easy)
 * https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
 *
 * Approach:
 *
 * Time:  O(?)
 * Space: O(?)
 */
class Solution {
    fun countOdds(low: Int, high: Int): Int {
        var count = 0
        for (number in low..high){
            if (number % 2 != 0) count++
        }
        return count

    }
}