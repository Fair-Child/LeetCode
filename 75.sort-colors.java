import javafx.scene.input.PickResult;

/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        
        int leftBoundry = 0; // right most boundry of Os
        int rightBoundry = nums.length - 1; // left most boundry of 2s
        int pointer = 0;

        while (pointer <= rightBoundry) {
            if (nums[pointer] == 0) {
                nums[pointer] = nums[leftBoundry];
                nums[leftBoundry] = 0;
                leftBoundry++;
            } else if (nums[pointer] == 2){
                nums[pointer] = nums[rightBoundry];
                nums[rightBoundry] = 2;
                rightBoundry--;
                pointer--;
            }
            pointer++;
        }
    }
}
// @lc code=end

