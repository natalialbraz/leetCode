package plans.topinterview150.p0121_best_time_to_buy_and_sell_stock

class Solution2 {
    fun maxProfit(prices: IntArray): Int {
        var minimumToBuy = Int.MAX_VALUE
        var bestProfit = 0

        for (price in prices) {
            if (price < minimumToBuy) minimumToBuy = price
            val difference = price - minimumToBuy
            if (difference > bestProfit) bestProfit = difference
        }
        return bestProfit
    }
}