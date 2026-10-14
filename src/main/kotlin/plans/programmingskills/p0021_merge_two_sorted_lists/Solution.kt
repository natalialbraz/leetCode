package plans.programmingskills.p0021_merge_two_sorted_lists

import common.ListNode

/**
 * 21. Merge Two Sorted Lists (Easy)
 * https://leetcode.com/problems/merge-two-sorted-lists/
 *
 * Approach:
 *
 * Time:  O(?)
 * Space: O(?)
 */
class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var current1 = list1
        var current2 = list2

        val dummy = ListNode(0)  // fake starting node
        var current = dummy
        while (current1 != null && current2 != null) {
            if (current1.`val` < current2.`val`) {
                current.next = ListNode(current1.`val`)
                current1 = current1.next
                current = current.next!!
            } else {
                current.next = ListNode(current2.`val`)
                current2 = current2.next
                current = current.next!!
            }
        }
        current.next = current1 ?: current2
        return dummy.next
    }
}