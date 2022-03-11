/*
 * @lc app=leetcode id=1779 lang=java
 *
 * [1779] Find Nearest Point That Has the Same X or Y Coordinate
 */

// @lc code=start
class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int nearest = -1;
        int distance = 0;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < points.length; i++) {
            if (points[i][0] == x || points[i][1] == y) {
                distance = Math.abs(points[i][0] - x) + Math.abs(points[i][1] - y);
                
                if (distance < minDistance) {
                minDistance = distance;
                nearest = i;
                }
            }
            

        }

        return nearest;
    }
}
// @lc code=end

