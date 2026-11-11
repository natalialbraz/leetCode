package plans.coderbyte.first_factorial

class Solution {

    fun FirstFactorial(num: Int): Int {
        var prod = 1
        for (i in num downTo 1) {
            prod *= i
        }
        return prod

    }
}