/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
       
        int currentSubarray = nums[0];
        int maximumSubarray = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSubarray = Math.max(nums[i], currentSubarray + nums[i]);
            maximumSubarray = Math.max(currentSubarray, maximumSubarray);
        }
        
        return maximumSubarray;
    }
}
// @lc code=end

