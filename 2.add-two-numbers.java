import org.w3c.dom.NodeList;

/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 */

// @lc code=start
// public class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }
 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode node = new ListNode(0);
        ListNode n1 = l1, n2 = l2, temp = node;

        while (n1 != null || n2 != null) {
            carry /= 10;
            if (n1 != null) {
                carry += n1.val;
                n1 = n1.next;
            }
            if (n2 != null) {
                carry += n2.val;
                n2 = n2.next;
            }
            temp.next = new ListNode(carry%10);
            temp = temp.next;
        }

        if (carry >= 10) {
            temp.next = new ListNode(1);
        }
        
        return node.next;
    }
}
// @lc code=end

