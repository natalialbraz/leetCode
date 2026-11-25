package plans.hackerhank.elements_greater_than_previous_average

class Solution {

    /*
 * Complete the 'countResponseTimeRegressions' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY responseTimes as parameter.
 */

    fun countResponseTimeRegressions(responseTimes: Array<Int>): Int {
        if (responseTimes.size < 2 ) return 0
        var sum = responseTimes[0].toLong()
        var count = 0

        for (i in 1 until responseTimes.size) {
            if (responseTimes[i].toLong() * i > sum) count++
            sum += responseTimes[i]
        }
        return count
    }

}