import java.util.List;

/*
 * @lc app=leetcode id=350 lang=java
 *
 * [350] Intersection of Two Arrays II
 */

// @lc code=start
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int pointer1 = 0, pointer2 = 0;
        List<Integer> list = new ArrayList<>();

        while (true) {
            if (pointer1 >= nums1.length || pointer2 >= nums2.length) {
                break;
            }

            if (nums1[pointer1] == nums2[pointer2]) {
                list.add(nums1[pointer1]);
                pointer1++;
                pointer2++;
            } else if (nums1[pointer1] < nums2[pointer2]) {
                pointer1++;
            } else {
                pointer2++;
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
// @lc code=end

