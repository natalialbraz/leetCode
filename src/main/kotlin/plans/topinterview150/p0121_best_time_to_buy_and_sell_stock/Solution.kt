package plans.topinterview150.p0121_best_time_to_buy_and_sell_stock

/**
 * 121. Best Time to Buy and Sell Stock (Easy)
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 *
 * Approach:
 *
 * Time:  O(?)
 * Space: O(?)
 */
class Solution {
    fun maxProfit(prices: IntArray): Int {
        var minimumToBuy = 100000
        var bestProfit = 0

        for (i in prices.indices) {
            if (prices[i] < minimumToBuy) {
                minimumToBuy = prices[i]
            }
            val difference =  prices[i] - minimumToBuy

            if (difference > bestProfit) bestProfit = difference

        }
        return bestProfit
    }
}