import java.util.HashMap;

/*
 * @lc app=leetcode id=383 lang=java
 *
 * [383] Ransom Note
 */

// @lc code=start
class Solution {

    // using int array
    // Time Complexity: O

    public boolean canConstruct(String ransomNote, String magazine) {
        // int[] counter = new int[26];

        // for (char c: magazine.toCharArray()) {
        //     counter[c - 'a']++;
        // }

        // for (char c: ransomNote.toCharArray()) {
        //     if (counter[c - 'a'] == 0) {
        //         return false;
        //     }
        //     counter[c - 'a']--;
        // }

        // return true;

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) <= 0) {
                return false;
            }
            map.put(c, map.get(c) - 1);
        }
        return true;
    }


}
// @lc code=end

