/*
 * @lc app=leetcode id=1492 lang=java
 *
 * [1492] The kth Factor of n
 */

// @lc code=start
class Solution {
    public int kthFactor(int n, int k) {
        
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                k--;
                if (k == 0) {
                    return i;
                }
            }
        }

        return k == 1? n : -1;
    }
}
// @lc code=end

