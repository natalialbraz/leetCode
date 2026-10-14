package plans.programmingskills.p0043_multiply_strings

import kotlin.math.max

/**
 * 43. Multiply Strings (Medium)
 * https://leetcode.com/problems/multiply-strings/
 *
 * Approach:
 *
 * Time:  O(?)
 * Space: O(?)
 */
class Solution {
    fun multiply(num1: String, num2: String): String {
        if (num1 == "0" || num2 == "0") return "0"
        val size1 = num1.length - 1
        var i1 = size1
        var carry = 0
        val result = mutableListOf<String>()
        val parcel = StringBuilder()

        while (i1 >= 0) {
            val zero = "0".repeat(result.size)
            parcel.append(zero)
            for (i2 in num2.length - 1 downTo 0) {
                val multi = (num2[i2] - '0') * (num1[i1] - '0') + carry
                carry = if (multi > 9) multi / 10 else 0
                val item = if (multi > 9) multi % 10 else multi
                parcel.append("$item")
            }
            if (carry != 0) parcel.append(carry)
            result.add(parcel.toString().reversed())
            parcel.clear()
            carry = 0
            i1--
        }
        var total = "0"
        for (installment in result) {
            total = addStrings(total, installment)
        }
        return total
    }

    fun addStrings(a: String, b: String): String {
        var carry = 0
        val result = StringBuilder()
        var bI = b.length - 1
        var aI = a.length - 1

        for (iMax in max(aI, bI) downTo 0) {
            val firstTerm = if (aI >= 0) a[aI] - '0' else 0
            val secondTerm = if (bI >= 0) b[bI] - '0' else 0
            val sum = firstTerm + secondTerm + carry
            val item = sum % 10
            carry = sum / 10
            result.append(item)
            bI--
            aI--
        }
        if (carry != 0) result.append("1")
        return result.toString().reversed()
    }
}