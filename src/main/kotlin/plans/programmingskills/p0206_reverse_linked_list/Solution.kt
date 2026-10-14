package plans.programmingskills.p0206_reverse_linked_list

import common.ListNode

/**
 * 206. Reverse Linked List (Easy)
 * https://leetcode.com/problems/reverse-linked-list/
 *
 * Approach:
 *
 * Time:  O(?)
 * Space: O(?)
 */
class Solution {
    fun reverseList(head: ListNode?): ListNode? {

        val dummy = ListNode(0)  // fake starting node
        var current = dummy
        var original = head

        val auxList = mutableListOf<Int>()

        while (original?.`val` != null) {
            auxList.add(original.`val`)
            original = original.next
        }

        for (item in auxList.asReversed()) {
            current.next = ListNode(item)
            current = current.next!!
        }
        return dummy.next

    }
}