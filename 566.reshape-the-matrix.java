/*
 * @lc app=leetcode id=566 lang=java
 *
 * [566] Reshape the Matrix
 */

// @lc code=start
class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        
        int[][] result = new int[r][c];

        if (nums.length == 0 || r * c != nums.length * nums[0].length) {
            return nums;
        }

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                result[count/c][count%c] = nums[i][j];
                count++;
            }
        }
        return result;
    }
}
// @lc code=end

