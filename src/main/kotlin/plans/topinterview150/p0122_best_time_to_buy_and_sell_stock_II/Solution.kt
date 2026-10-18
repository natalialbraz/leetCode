package plans.topinterview150.p0122_best_time_to_buy_and_sell_stock_II

class Solution {
    fun maxProfit(prices: IntArray): Int {
        var minimumToBuy = Int.MAX_VALUE
        var bestProfit = 0
        var minIndice = 0
        var sumProfit = 0

        while(minIndice < prices.size) {

            for (i in minIndice until prices.size) {
                if (prices[i] < minimumToBuy) {
                    minimumToBuy = prices[i]
                    minIndice = i
                }
                val difference = prices[i] - minimumToBuy
                if (difference > bestProfit) bestProfit = difference
            }
            sumProfit += bestProfit
            minimumToBuy = Int.MAX_VALUE
        }
        return sumProfit
    }
}