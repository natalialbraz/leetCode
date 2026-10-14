package plans.programmingskills.p1822_sign_of_the_product_of_an_array

/**
 * 1822. Sign of the Product of an Array (Easy)
 * https://leetcode.com/problems/sign-of-the-product-of-an-array/
 *
 * Approach:
 *
 * Time:  O(?)
 * Space: O(?)
 */
class Solution {
    fun arraySign(nums: IntArray): Int {
        var negCount = 0

        for (num in nums) {
            if (num == 0 ) return 0
            if (num < 0) negCount++
        }
        return signFunc(negCount)
    }

    fun signFunc(product: Int) : Int {
        return when {
            product % 2 == 0 -> 1
            product % 2 != 0  -> -1
            else -> 0
        }
    }
}