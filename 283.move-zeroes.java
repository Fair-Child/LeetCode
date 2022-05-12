/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int zeroes = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroes++;
            } else if (zeroes > 0) {
                int temp = nums[i];
                nums[i] = 0;
                nums[i - zeroes] = temp;
            }
        }
    }
}
// @lc code=end

