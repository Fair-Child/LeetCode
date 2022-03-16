import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=1790 lang=java
 *
 * [1790] Check if One String Swap Can Make Strings Equal
 */

// @lc code=start
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        List<Integer> swap = new ArrayList<>();

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                swap.add(i);
            }
            if (swap.size() > 2) {
                return false;
            }
        }

        return swap.size() == 0 || (swap.size() == 2 
        && s1.charAt(swap.get(0)) == s2.charAt(swap.get(1)) 
        && s1.charAt(swap.get(1)) == s2.charAt(swap.get(0)));
        
    }
}
// @lc code=end

