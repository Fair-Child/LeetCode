import java.util.List;

/*
 * @lc app=leetcode id=46 lang=java
 *
 * [46] Permutations
 */

// 经典回溯排列组合问题，谷歌面试题

// @lc code=start
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums);

        return list;
    }
 
    public void backtrack(List<List<Integer>> list, List<Integer> temp, int[] nums) {
        if (temp.size() == nums.length) {
            list.add(new ArrayList<>(temp));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (temp.contains(nums[i])) continue;
                temp.add(nums[i]);
                backtrack(list, temp, nums);
                temp.remove(temp.size() - 1);
            }
        }
    }


}
// @lc code=end

