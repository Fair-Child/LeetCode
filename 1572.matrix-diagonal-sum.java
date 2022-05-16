/*
 * @lc app=leetcode id=1572 lang=java
 *
 * [1572] Matrix Diagonal Sum
 */

// @lc code=start
class Solution {
    public int diagonalSum(int[][] mat) {
        
        int sum = 0;
        int col = mat[0].length;
        
        for (int i = 0; i < col; i++) {
            sum += mat[i][i] + mat[i][col - i - 1];
        }
        
        return (col % 2 == 0) ? sum : sum - mat[col/2][col/2];

    }
}
// @lc code=end

