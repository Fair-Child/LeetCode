/*
 * @lc app=leetcode id=828 lang=java
 *
 * [828] Count Unique Characters of All Substrings of a Given String
 */

// @lc code=start
class Solution {
    public int uniqueLetterString(String s) {

        int res = 0;

        if (s == null || s.length() == 0) {
            return res;
        }

        int[] showLastPosition = new int[128];
        int[] contribution = new int[128];

        int cur = 0;
        
        
    }
}
// @lc code=end

