/*
 * @lc app=leetcode id=226 lang=java
 *
 * [226] Invert Binary Tree
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
    public TreeNode invertTree(TreeNode root) {
        // base case
        if (root == null) {
            return root;
        }
        // invert left subtree
        invertTree(root.left);
        // invert right subtree
        invertTree(root.right);
        // swaping process
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        return root;
    }
}
// @lc code=end
