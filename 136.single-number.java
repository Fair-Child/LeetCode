import java.util.HashMap;

/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], 2);
            }
        }

        for (int key:nums) {
            if (map.get(key) == 1) {
                return key;
            }
        }
        return 0;
    }
}
// @lc code=end

