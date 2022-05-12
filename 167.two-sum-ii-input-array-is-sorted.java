/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input Array Is Sorted
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {

        int left = 0, right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[] {left+1, right+1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        return new int[] {-1, -1};
    }
}
// @lc code=end

