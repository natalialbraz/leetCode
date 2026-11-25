package plans.hackerhank.breaking_records

class Solution {

    /*
 * Complete the 'breakingRecords' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY scores as parameter.
 */

    fun breakingRecords(scores: Array<Int>): Array<Int> {
        var max = Int.MIN_VALUE
        var min = Int.MAX_VALUE
        var countMin = 0
        var countMax = 0
        for (score in scores) {
            if (score < min) {
                min = score
                countMin++
            }
            if (score > max) {
                max = score
                countMax++
            }

        }
        return arrayOf(countMax-1, countMin-1)
    }
}