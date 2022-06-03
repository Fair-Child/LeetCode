import java.util.Comparator;

/*
 * @lc app=leetcode id=1356 lang=java
 *
 * [1356] Sort Integers by The Number of 1 Bits
 */

// @lc code=start
class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] a = new Integer[arr.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = arr[i];
        }

        Arrays.sort(a, Comparator.comparing(i -> Integer.bitCount(i) * 10000 + i));
        for (int i = 0; i < a.length; i++) {
            arr[i] = a[i];
        }
        return arr;
    }
}
// @lc code=end

