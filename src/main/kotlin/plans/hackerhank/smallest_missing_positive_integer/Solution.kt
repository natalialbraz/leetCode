package plans.hackerhank.smallest_missing_positive_integer

class Solution {
    /*
 * Complete the 'findSmallestMissingPositive' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY orderNumbers as parameter.
 */

    fun findSmallestMissingPositive(orderNumbers: Array<Int>): Int {
        val set = orderNumbers.toSet()
        if (orderNumbers.isEmpty()) return 1

        for (i in 1 until orderNumbers.size+1) {
            if (!set.contains(i)) return i
        }
        return set.size+1
    }
}