import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/*
 * @lc app=leetcode id=151 lang=java
 *
 * [151] Reverse Words in a String
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {

        s = s.trim();

        List<String> wordlist = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordlist);
        
        return String.join(" ", wordlist);
    }
}
// @lc code=end

