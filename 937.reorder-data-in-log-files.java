import java.util.Arrays;
import java.util.Comparator;

/*
 * @lc app=leetcode id=937 lang=java
 *
 * [937] Reorder Data in Log Files
 */

// @lc code=start
class Solution {
    public String[] reorderLogFiles(String[] logs) {

        Arrays.sort(logs, (s1, s2) -> {
            String[] split1 = s1.split(" ", 2);
            String[] split2 = s2.split(" ", 2);

            boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
            boolean isDIgit2 = Character.isDigit(split2[1].charAt(0));

            if (!isDigit1 && !isDIgit2) {
                // both letter-logs
                int comp = split1[1].compareTo(split2[1]);
                if (comp == 0) {
                    return split1[0].compareTo(split2[0]);
                } else {
                    return comp;
                }
            } else if (isDigit1 && isDIgit2) {
                // both digit-logs, so keep them in original order
                return 0;
            } else if (isDigit1 && !isDIgit2) {
                // first is digit, second is letter, bring letter to forward
                return 1;
            } else {
                // first is letter, second is digit, keep them in this order
                return -1;
            }
        });
        return logs;
    }
}
// @lc code=end

