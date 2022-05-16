/*
 * @lc app=leetcode id=1672 lang=java
 *
 * [1672] Richest Customer Wealth
 */

// @lc code=start
class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int max = 0;

        for (int[] account : accounts) {
            int curr = 0;
            for (int money : account) {
                curr += money;
            }
            max = Math.max(max, curr);
        }

        return max;
    }
}
// @lc code=end

