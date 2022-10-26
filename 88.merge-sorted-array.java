/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        // make a copy of the nums1 first m elements
        int[] nums1copy = new int[m];
        for (int i = 0; i < m; i++) {
            nums1copy[i] = nums1[i];
        }
        
        int p1 = 0, p2 = 0;
        
        for (int p = 0; p < m + n; p++) {
            // need to ensure that p1 and p2 aren't over the boundaries
            // of their respective arrays.
            if (p2 >= n || (p1 < m && nums1copy[p1] < nums2[p2])) {
                nums1[p] = nums1copy[p1++];
            } else {
                nums1[p] = nums2[p2++];
            }
        }
    }
}
// @lc code=end

