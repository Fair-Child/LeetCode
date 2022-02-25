import java.util.HashMap;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        /*using HashMap: for value of index i, check map by using key = target - value, 
	    * if it exist, use the index i and value of that key as result,
	    * else, set target - value of index i as key of map, and the index of i as value.
	    */
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i <= nums.length; i++){
            if (map.get(target - nums[i]) != null) {
                return new int[] {i, map.get(target - nums[i])};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
// @lc code=end

