/*
 * @lc app=leetcode id=203 lang=java
 *
 * [203] Remove Linked List Elements
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
    public ListNode removeElements(ListNode head, int val) {
        // recurive way
        // if (head == null) return null;
        // head.next = removeElements(head.next, val);
        // return head.val == val ? head.next : head;

        ListNode fakeHead = new ListNode();
        fakeHead.next = head;
        ListNode curr = head, prev = fakeHead;

        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            } else {
                prev = prev.next;
            }
            curr = curr.next;
        }

        return fakeHead.next;
    }
}
// @lc code=end

