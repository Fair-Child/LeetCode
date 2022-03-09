/*
 * @lc app=leetcode id=34 lang=java
 *
 * [34] Find First and Last Position of Element in Sorted Array
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {

        // if (nums.length == 0 || nums == null) {
        //     return new int[]{-1, -1};
        // }

        // int leftBound = 0, rightBound = nums.length;
        // int leftPointer = 0, rightPointer = nums.length;
        // int mid;

        // // binary search 1 for starting position
        // while (leftPointer < rightPointer) {
        //     mid = leftPointer + (rightPointer - leftPointer) / 2;
        //     if (nums[mid] < target) {
        //         leftPointer = mid + 1 ;
        //     } else {
        //         rightPointer = mid;
        //     }
        // }
        // leftBound = leftPointer;

        // while (left)

        if (nums.length == 0 || nums == null)
            return new int[]{-1,-1};
        
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target)
                left = mid + 1;
            else
                right = mid;
        }
        int end = left - 1;
        if (end == -1 || nums[end] != target)
            return new int[]{-1,-1};
        
        left = 0; right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid;
        }
        return new int[]{left, end};
        
    }
}
// @lc code=end

