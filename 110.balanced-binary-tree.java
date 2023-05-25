/*
 * @lc app=leetcode id=110 lang=java
 *
 * [110] Balanced Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        if (height(root) == -1) return false;

        return true;
    }

    public int height(TreeNode root) {
        // base case
        if (root == null) return 0;

        // height of left subtree
        int leftHeight = height(root.left);

        // height of right subtree
        int rightHeight = height(root.right);

        // in case of left subtree or right subtree unbalanced
        if (leftHeight == -1 || rightHeight == -1) return -1;

        // if their heights differ by more than 1, return false
        if (Math.abs(leftHeight - rightHeight) > 1) return -1;
        
        // otherwise, return the height of this subtree as max(leftHeight, rightHeight) + 1
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
// @lc code=end

