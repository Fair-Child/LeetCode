import java.util.HashMap;

/*
 * @lc app=leetcode id=387 lang=java
 *
 * [387] First Unique Character in a String
 */

// @lc code=start
class Solution {
    public int firstUniqChar(String s) {
        
        // int[] count = new int[26];

        // for (int i = 0; i < s.length(); i++) {
        //     count[s.charAt(i) - 'a']++;
        // }

        // for (int j = 0; j < s.length(); j++) {
        //     if (count[s.charAt(j) - 'a'] == 1) {
        //         return j;
        //     }
        // }

        // return -1;

        // using HashMap
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        
        for (int i = 0; i < s.length(); i++) {
            count.put(s.charAt(i), count.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int j = 0; j < s.length(); j++) {
            if (count.get(s.charAt(j)) == 1) {
                return j;
            }
        }

        return -1;
    }
}
// @lc code=end

