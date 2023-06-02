/*
 * @lc app=leetcode id=57 lang=java
 *
 * [57] Insert Interval
 */

// @lc code=start
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();

        for (int[] slot : intervals) {
            // if newInterval before slot, insert newInterval & update slot as new interval
            if (newInterval[1] < slot[0]) {
                result.add(newInterval);
                newInterval = slot;
            } 
            // if slot is lesser than new interval insert slot
            else if (slot[1] < newInterval[0]) {
                result.add(slot);
            } 
            // if above conditions fail, its a overlap since possibily of new interval existing in left & right of slot is checked
            // update lowest of start & highest of end & not insert
            else {
                newInterval[0] = Math.min(newInterval[0], slot[0]);
                newInterval[1] = Math.max(newInterval[1], slot[1]);
            }
        }
        result.add(newInterval);

        return result.toArray(new int[result.size()][]);
    }
}
// @lc code=end

