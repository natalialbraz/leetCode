package plans.hackerhank.apple_and_orange

class Solution {

    /*
 * Complete the 'countApplesAndOranges' function below.
 *
 * The function accepts following parameters:
 *  1. INTEGER s -- start point
 *  2. INTEGER t -- end point
 *  3. INTEGER a -- apple tree point
 *  4. INTEGER b -- orange tree point
 *  5. INTEGER_ARRAY apples
 *  6. INTEGER_ARRAY oranges
 */

    fun countApplesAndOranges(
        s: Int,
        t: Int,
        a: Int,
        b: Int,
        apples: Array<Int>,
        oranges: Array<Int>
    ) {
        val samsHouseRange = s..t
        val fallenApples = apples.count { a + it in samsHouseRange }
        val fallenOranges = oranges.count { b + it in samsHouseRange }
        println(fallenApples)
        println(fallenOranges)
    }

}