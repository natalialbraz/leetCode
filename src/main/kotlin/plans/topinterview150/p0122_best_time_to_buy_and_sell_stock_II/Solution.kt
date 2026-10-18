package plans.topinterview150.p0122_best_time_to_buy_and_sell_stock_II

class Solution {
    fun maxProfit(prices: IntArray): Int {
        var bestProfit = 0

        for (i in 1 until prices.size) {
            val diference = prices[i] - prices[i - 1]
            if (diference > 0) {
                bestProfit += diference
            }
        }
        return bestProfit
    }
}