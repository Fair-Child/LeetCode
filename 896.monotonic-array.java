/*
 * @lc app=leetcode id=896 lang=java
 *
 * [896] Monotonic Array
 */

// @lc code=start
class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increase = true;
        boolean decrease = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i+1]) {
                increase = false;
            }
            if (nums[i] < nums[i+1]) {
                decrease = false;
            }
        }
        return increase || decrease;
    }
}
// @lc code=end

