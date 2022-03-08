/*
 * @lc app=leetcode id=926 lang=java
 *
 * [926] Flip String to Monotone Increasing
 */

// @lc code=start
class Solution {
    public int minFlipsMonoIncr(String s) {
        
        int one = 0;
        int flip = 0;
        
        for (int i = 0; i < s.length(); i++) {
            
            if (s.charAt(i) == '1') {
                one++;
            } else {
                flip++;
            }
            flip = Math.min(one, flip);
        }
        return flip;
    }
}
// @lc code=end

