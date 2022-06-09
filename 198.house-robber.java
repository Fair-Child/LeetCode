/*
 * @lc app=leetcode id=198 lang=java
 *
 * [198] House Robber
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        int len = nums.length;

        // if no house, 0 profit
        if (len == 0) {
            return 0;
        }

        int[] maxProfit = new int[nums.length + 1];
        maxProfit[len] = 0;
        maxProfit[len - 1] = nums[len - 1];

        for (int i = len - 2; i >= 0; i--) {
            maxProfit[i] = Math.max(maxProfit[i + 1], maxProfit[i + 2] + nums[i]);
        }

        return maxProfit[0];

    }
}
// @lc code=end

