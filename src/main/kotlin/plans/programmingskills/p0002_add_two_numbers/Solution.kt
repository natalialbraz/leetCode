package plans.programmingskills.p0002_add_two_numbers

import common.ListNode
import kotlin.math.max

/**
 * 2. Add Two Numbers (Medium)
 * https://leetcode.com/problems/add-two-numbers/
 *
 * Approach:
 *
 * Time:  O(?)
 * Space: O(?)
 */
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {

        var prev1 = l1
        var prev2 = l2
        val p1 = StringBuilder()
        val p2 = StringBuilder()
        while (prev1 != null || prev2 != null) {
            if (prev1 == null) p1.append(0) else p1.append(prev1.`val` )
            if (prev2 == null) p2.append(0) else p2.append(prev2.`val` )
            prev1 = prev1?.next
            prev2 = prev2?.next
        }
        val total = addDecimal(p1.reversed().toString(), p2.reversed().toString())
        val dummy = ListNode(0)  // fake starting node
        var prevFinal = dummy

        for (i in total) {
            prevFinal.next = ListNode(i - '0')
            prevFinal = prevFinal.next!!
        }

        return dummy.next

    }

    fun addDecimal(a: String, b: String): String {
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
        return result.toString()
    }
}