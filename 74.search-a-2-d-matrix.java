/*
 * @lc app=leetcode id=74 lang=java
 *
 * [74] Search a 2D Matrix
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // int index = 0;

        // if (matrix.length == 0) {
        //     return false;
        // }

        // for (int i = 0; i < matrix.length; i++) {
        //     if (matrix[i][0] == target) {
        //         return true;
        //     } else if (matrix[i][0] < target && i > 0) {
        //         index++;
        //     }
        // }

        // for (int j = 0; j < matrix[index].length; j++) {
        //     if (matrix[index][j] == target) {
        //         return true;
        //     }
        // }
        // return false;

        int m = matrix.length; int n = matrix[0].length;
        int left = 0, right = m * n - 1;
        int mid;

        if (matrix.length == 0) {
            return false;
        }

        while (left <= right) {
            mid = left + (right - left) / 2;
            if (target == matrix[mid/n][mid%n]) {
                return true;
            } else if (target > matrix[mid/n][mid%n]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
// @lc code=end

