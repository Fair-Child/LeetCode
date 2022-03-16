/*
 * @lc app=leetcode id=844 lang=java
 *
 * [844] Backspace String Compare
 */

// @lc code=start
class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    public String build(String s) {
        Stack<Character> result = new Stack();

        for (char c:s.toCharArray()) {
            if (c != '#') {
                result.push(c);
            } else if (!result.isEmpty()){
                result.pop();
            }
        }
        return String.valueOf(result);
    }
}
// @lc code=end

