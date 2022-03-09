/*
 * @lc app=leetcode id=1491 lang=java
 *
 * [1491] Average Salary Excluding the Minimum and Maximum Salary
 */

// @lc code=start
class Solution {
    public double average(int[] salary) {
        double sum = 0;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for (int i : salary) {
            sum += i;
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        return (sum - max - min)/(salary.length - 2);
    }
}
// @lc code=end

