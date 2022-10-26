/*
 * @lc app=leetcode id=557 lang=java
 *
 * [557] Reverse Words in a String III
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();

        int left = 0;
        int right;

        
        for (right = 0; right <= chars.length; right++) {
            // When 'right' reaches ' ' or end of array, reverse the words from 'start' to 'end' - 1 index in 'chars'.
            if (right == chars.length || chars[right] == ' ') {
                reverse(chars, left, right-1);
                left = right+1;
            }
        }
        return new String(chars);
    }

    private void reverse(char[] c, int left, int right) {
        while (left < right) {
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;
            left++;
            right--;
        }
    }
}
// @lc code=end

