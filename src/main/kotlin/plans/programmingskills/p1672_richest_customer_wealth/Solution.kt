package plans.programmingskills.p1672_richest_customer_wealth

/**
 * 1672. Richest Customer Wealth (Easy)
 * https://leetcode.com/problems/richest-customer-wealth/
 *
 * Approach:
 *
 * Time:  O(?)
 * Space: O(?)
 */
class Solution {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        var maximumWealth = 0
        var sumMoney = 0
        for (customer in accounts) {
            sumMoney = 0
            for (bank in customer){
                sumMoney += bank
            }
            if (sumMoney > maximumWealth) maximumWealth = sumMoney
        }
        return maximumWealth
    }
}