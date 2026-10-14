package plans.programmingskills.p0206_reverse_linked_list

import common.ListNode

class Solution2 {
    fun reverseList(head: ListNode?): ListNode? {

        var prev: ListNode? = null
        var current = head

        while (current != null) {
            val next = current.next  // save next
            current.next = prev      // reverse arrow!
            prev = current           // move prev forward
            current = next           // move current forward
        }
        return prev

    }
}