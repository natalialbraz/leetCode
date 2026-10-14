package plans.programmingskills.p0445_add_two_numbers_ii

import common.ListNode

/**
 * 445. Add Two Numbers II (Medium)
 * https://leetcode.com/problems/add-two-numbers-ii/
 *
 * Approach:
 *
 * Time:  O(?)
 * Space: O(?)
 */
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        // 1. push all digits onto stacks
        val stack1 = ArrayDeque<Int>()
        val stack2 = ArrayDeque<Int>()

        var curr1 = l1
        var curr2 = l2

        while (curr1 != null) { stack1.addLast(curr1.`val`); curr1 = curr1.next }
        while (curr2 != null) { stack2.addLast(curr2.`val`); curr2 = curr2.next }

        // 2. pop and add digit by digit
        var carry = 0
        var head: ListNode? = null  // no dummy needed!

        while (stack1.isNotEmpty() || stack2.isNotEmpty() || carry != 0) {
            val d1 = if (stack1.isNotEmpty()) stack1.removeLast() else 0
            val d2 = if (stack2.isNotEmpty()) stack2.removeLast() else 0
            val sum = d1 + d2 + carry
            carry = sum / 10

            // 3. build list BACKWARDS using head insertion!
            val node = ListNode(sum % 10)
            node.next = head  // new node points to previous head
            head = node       // new node becomes new head
        }

        return head
    }
}