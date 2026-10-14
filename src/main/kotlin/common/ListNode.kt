package common

/** Same definition LeetCode provides for linked list problems. */
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

/** Test helper: listNodeOf(1, 2, 3) -> 1 -> 2 -> 3 */
fun listNodeOf(vararg values: Int): ListNode? {
    val dummy = ListNode(0)
    var tail = dummy
    for (value in values) {
        tail.next = ListNode(value)
        tail = tail.next!!
    }
    return dummy.next
}

/** Test helper: 1 -> 2 -> 3 -> listOf(1, 2, 3) */
fun ListNode?.toList(): List<Int> {
    val result = mutableListOf<Int>()
    var node = this
    while (node != null) {
        result += node.`val`
        node = node.next
    }
    return result
}
