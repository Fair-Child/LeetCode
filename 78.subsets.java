import java.util.ArrayList;

/*
 * @lc app=leetcode id=78 lang=java
 *
 * [78] Subsets
 */

// @lc code=start
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> output = new ArrayList<>();
        output.add(new ArrayList<>());

        for (int num : nums) {
            List<List<Integer>> subset = new ArrayList<>();
            for (List<Integer> curr : output) {
                subset.add(new ArrayList<Integer>(curr){{add(num);}});
            }
            for (List<Integer> curr : subset) {
                output.add(curr);
            }
        }
        return output;
    }
}
// @lc code=end

