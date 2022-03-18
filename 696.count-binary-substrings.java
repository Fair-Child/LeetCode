/*
 * @lc app=leetcode id=696 lang=java
 *
 * [696] Count Binary Substrings
 */

// @lc code=start
class Solution {
    public int countBinarySubstrings(String s) {

        int cur = 1, pre = 0, result = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)) {
                cur++;
            } else {
                result += Math.min(cur, pre);
                pre = cur;
                cur = 1;
            }
        }
        return result + Math.min(cur, pre);
    }
}
// @lc code=end

