/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int result = 0;

        for (int price : prices) {
            buy = Math.min(buy, price);
            result = Math.max(result, price-buy);
        }
        return result;
    }
}
// @lc code=end

