import java.util.Arrays;

/*
 * @lc app=leetcode id=973 lang=java
 *
 * [973] K Closest Points to Origin
 */

// @lc code=start
class Solution {

    public int[][] kClosest(int[][] points, int k) {
        
        Arrays.sort(points, (a, b) -> squaredDistance(a) - squaredDistance(b));

        return Arrays.copyOf(points, k);

    }

    public int squaredDistance(int[] point) {
        return (int)(Math.pow(point[0], 2) + Math.pow(point[1], 2));
    }

}
// @lc code=end

