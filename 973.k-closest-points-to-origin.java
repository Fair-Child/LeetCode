import java.util.Arrays;
import java.util.Queue;

/*
 * @lc app=leetcode id=973 lang=java
 *
 * [973] K Closest Points to Origin
 */

// @lc code=start
class Solution {

    // public int[][] kClosest(int[][] points, int k) {
        
    //     Arrays.sort(points, (a, b) -> squaredDistance(a) - squaredDistance(b));

    //     return Arrays.copyOf(points, k);

    // }

    // public int squaredDistance(int[] point) {
    //     return (int)(Math.pow(point[0], 2) + Math.pow(point[1], 2));
    // }


    public int[][] kClosest(int[][] points, int k) {
        Queue<int[]> maxPQ = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        for (int i = 0; i < points.length; i++) {
            int[] entry = {squaredDistance(points[i]), i};
            if (maxPQ.size() < k) {
                maxPQ.add(entry);
            } else if (entry[0] < maxPQ.peek()[0]) {
                maxPQ.poll();
                maxPQ.add(entry);
            }
        }

        int[][] answer = new int[k][2];
        for (int i = 0; i < k; i++) {
            int entryIndex = maxPQ.poll()[1];
            answer[i] = points[entryIndex];
        }

        return answer;
    }

    private int squaredDistance(int[] point) {
        int result = (int)(Math.pow(point[0], 2) + Math.pow(point[1], 2));
        return result;
    }

}
// @lc code=end

