package plans.programmingskills.p0066_plus_one

class Solution2 {
    fun plusOne(digits: IntArray): IntArray {
        val default = IntArray(digits.size + 1).also { it[0] = 1 }
        for (i in digits.size-1 downTo 0) {
            when {
                digits[i] != 9 -> {
                    digits[i]++
                    return digits
                }

                else -> digits[i] = 0

            }
        }
        return default
    }
}