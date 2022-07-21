/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {

        int currentSubArray = nums[0];
        int maximumSubArray = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSubArray = Math.max(currentSubArray + nums[i], nums[i]);
            maximumSubArray = Math.max(currentSubArray, maximumSubArray);
        }
        
        return maximumSubArray;
    }
}
// @lc code=end

