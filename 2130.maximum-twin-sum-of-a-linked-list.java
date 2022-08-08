import java.util.ArrayList;

/*
 * @lc app=leetcode id=2130 lang=java
 *
 * [2130] Maximum Twin Sum of a Linked List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while (head != null) {
            arr.add(head.val);
            head = head.next;
        }
        int left = 0, right = arr.size() - 1;
        int max = 0;
        while (left < right) {
            max = Math.max(max, arr.get(left) + arr.get(right));
            left++;
            right--;
        }
        return max;
    }
}
// @lc code=end

