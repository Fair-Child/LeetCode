import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
class Solution {
    
    // public List<List<Integer>> threeSum(int[] nums) {

    //     Set<List<Integer>> result = new HashSet<>();
    //     if (nums.length==0) {
    //         return new ArrayList<>(result);
    //     }
    //     Arrays.sort(nums);

    //     for (int i = 0; i < nums.length - 2; i++) {
    //         int j = i + 1, k = nums.length - 1;
    //         while (j < k) {
    //             int sum = nums[i] + nums[j] + nums[k];
    //             if (sum == 0) {
    //                 result.add(Arrays.asList(nums[i], nums[j++], nums[k++]));
    //             } else if (sum > 0) {
    //                 k--;
    //             } else if (sum < 0) {
    //                 j++;
    //             }
    //         }
    //     }
    //     return new ArrayList<>(result);
    // }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums == null || nums.length < 3)
            return result;
        for (int i = 0; i <= length - 3; i++) {
            // Remove duplicates
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int target = 0 - nums[i];
            int l = i + 1, r = length - 1;
            while (l < r) {
                if (nums[l] + nums[r] == target) {
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while (l < r && nums[l] == nums[l+1]) l++; // remove duplicates
                    while (l < r && nums[r] == nums[r-1]) r--; // remove duplicates
                    l++;
                    r--;
                } else if (nums[l] + nums[r] < target) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return result;
    }

}
// @lc code=end

