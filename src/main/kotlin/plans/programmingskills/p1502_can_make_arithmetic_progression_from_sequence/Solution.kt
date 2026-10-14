package plans.programmingskills.p1502_can_make_arithmetic_progression_from_sequence

/**
 * 1502. Can Make Arithmetic Progression From Sequence (Easy)
 * https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
 *
 * Approach:
 *
 * Time:  O(?)
 * Space: O(?)
 */
class Solution {
    fun canMakeArithmeticProgression(arr: IntArray): Boolean {
        var minValuePosition = 0 to 0

        if (arr.size == 1) return false

        if (arr.size == 2) return true

        for (k in 0 until arr.size - 1) {
            minValuePosition = arr[k] to k
            for (i in k + 1 until arr.size) {
                if (arr[i] < minValuePosition.first) minValuePosition = arr[i] to i
            }

            arr[minValuePosition.second] = arr[k]
            arr[k] = minValuePosition.first

        }

        for (i in 1 until arr.size-1) {
            if (arr[i] - arr[i-1] != arr[i+1] - arr[i]) return false
        }
        return true
    }
}