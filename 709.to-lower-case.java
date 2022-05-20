/*
 * @lc app=leetcode id=709 lang=java
 *
 * [709] To Lower Case
 */

// @lc code=start
class Solution {
    public String toLowerCase(String s) {
        
        //return s.toLowerCase();

        Map<Character, Character> map = new HashMap<>();
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        
        for (int i = 0; i < 26; i++) {
            map.put(upper.charAt(i), lower.charAt(i));
        }
        
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(map.containsKey(c) ? map.get(c) : c);
        }
        
        return sb.toString();

    }
}
// @lc code=end

