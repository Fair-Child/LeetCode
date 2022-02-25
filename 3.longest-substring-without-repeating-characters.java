import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int left = 0, right = 0; right < s.length(); right++) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(left, map.get(s.charAt(right)));
            }
            result = Math.max(result, right-left+1);
            map.put(s.charAt(right), right+1);
        }
        return result;
    }
}
// @lc code=end

