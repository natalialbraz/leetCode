package plans.programmingskills.p1822_sign_of_the_product_of_an_array

class Solution2 {
    fun arraySign(nums: IntArray): Int {
        var negCount = 0

        for (num in nums) {
            if (num == 0 ) return 0
            if (num < 0) negCount++
        }
        return signFunc(negCount)
    }

    fun signFunc(product: Int) : Int {
        return if (product % 2 == 0) 1 else -1
    }
}