/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Implement strStr()
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        
        int l1 = haystack.length(), l2 = needle.length();
        
        if (l2 == 0){
            return 0;
        }
        int length = l1 - l2;
        for (int i = 0; i <= length; i++) {
            if (haystack.substring(i, i+l2).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
// @lc code=end

