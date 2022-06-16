/*
 * @lc app=leetcode id=198 lang=java
 *
 * [198] House Robber
 */

// @lc code=start
class Solution {

    // Solution One
    
    public int rob(int[] nums) {
        int len = nums.length;

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

    // Solution Two

    // public int rob(int[] nums) {
    //     int length = nums.length;
        
    //     if (length == 0) {
    //         return 0;
    //     }
        
    //     int robNext, robNextOne;
        
    //     robNextOne = 0;
    //     robNext = nums[length - 1];
        
    //     for (int i = length - 2; i >= 0; i--) {
    //         int current = Math.max(robNext, robNextOne + nums[i]);
            
    //         robNextOne = robNext;
    //         robNext = current;
    //     }
        
    //     return robNext;
    // }

}
// @lc code=end

