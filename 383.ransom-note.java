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
        int[] counter = new int[26];

        for (char c: magazine.toCharArray()) {
            counter[c - 'a']++;
        }

        for (char c: ransomNote.toCharArray()) {
            if (counter[c - 'a'] == 0) {
                return false;
            }
            counter[c - 'a']--;
        }

        return true;
    }


}
// @lc code=end

