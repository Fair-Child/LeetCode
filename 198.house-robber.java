/*
 * @lc app=leetcode id=198 lang=java
 *
 * [198] House Robber
 */

// @lc code=start
class Solution {

    public int rob(int[] nums) {
        int length = nums.length;
        
        if (length == 0) {
            return 0;
        }
        
        int robNext, robNextOne;
        
        robNextOne = 0;
        robNext = nums[length - 1];
        
        for (int i = length - 2; i >= 0; i--) {
            int current = Math.max(robNext, robNextOne + nums[i]);
            
            robNextOne = robNext;
            robNext = current;
        }
        
        return robNext;
    }

}
// @lc code=end

