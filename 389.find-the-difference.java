/*
 * @lc app=leetcode id=389 lang=java
 *
 * [389] Find the Difference
 */

// @lc code=start
class Solution {
    public char findTheDifference(String s, String t) {
        
        //  // Sort both the strings
        //  char[] sortedS = s.toCharArray();
        //  char[] sortedT = t.toCharArray();
        //  Arrays.sort(sortedS);
        //  Arrays.sort(sortedT);
 
        //  // Character by character comparison
        //  int i = 0;
        //  while (i < s.length()) {
        //      if (sortedS[i] != sortedT[i]) {
        //          return sortedT[i];
        //      }
        //      i += 1;
        //  }
 
        //  return sortedT[i];

        char result = 0;
        
        HashMap<Character, Integer> counter = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }
        
        for (int j = 0; j < t.length(); j++) {
            char c = t.charAt(j);
            Integer countOfChar = counter.get(c);
            if (countOfChar == null || countOfChar == 0) {
                result = c;
            } else {
                counter.replace(c, countOfChar - 1);
            }
        }
        
        return result;

    }
}
// @lc code=end

