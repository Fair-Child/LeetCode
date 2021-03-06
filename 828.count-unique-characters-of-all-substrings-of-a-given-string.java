/*
 * @lc app=leetcode id=828 lang=java
 *
 * [828] Count Unique Characters of All Substrings of a Given String
 */

// @lc code=start
class Solution {
    public int uniqueLetterString(String s) {

        int result = 0;

        if (s == null || s.length() == 0) {
            return result;
        }

        int[] showLastPosition = new int[128];
        int[] contribution = new int[128];
        int cur = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            cur -= contribution[c];
            contribution[c] = (i - (showLastPosition[c] - 1));
            cur += contribution[c];
            showLastPosition[c] = i + 1;
            result += cur;
        }
        
        return result;
    }
}
// @lc code=end

