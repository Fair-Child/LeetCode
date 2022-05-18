/*
 * @lc app=leetcode id=1768 lang=java
 *
 * [1768] Merge Strings Alternately
 */

// @lc code=start
class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word1.length() || i < word2.length(); i++) {
            if (i < word1.length())
                result.append(word1.charAt(i));
            if (i < word2.length())
                result.append(word2.charAt(i));
        }

        return result.toString();
    }
}
// @lc code=end

