package plans.programmingskills.p1523_count_odd_numbers_in_an_interval_range

class Solution2 {
    fun countOdds(low: Int, high: Int): Int {
        val oddsLow = (low-1  + 1) / 2
        val oddsHigh = (high + 1) / 2

        return oddsHigh - oddsLow

    }
}