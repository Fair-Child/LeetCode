import java.util.HashMap;

/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        int majority = 1;
        HashMap <Integer, Integer> map = new HashMap<>();

        for (int num:nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num)+1);
                majority = Math.max(majority, map.get(num));
            }
        }

        for (int key:map.keySet()) {
            if (map.get(key) == majority) {
                return key;
            }
        }
        return 0;
    }
}
// @lc code=end

