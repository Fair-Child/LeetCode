/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }

        String str = s.replaceAll("[^a-zA-Z0-9]", ""); 
        int head = 0, tail = str.length() - 1;
        char cHead, cTail;

        while (head <= tail) {
            cHead = str.charAt(head);
            cTail = str.charAt(tail);
            if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
                return false;
            }
            head++;
            tail--;
        }
        
        return true;
    }
}
// @lc code=end

