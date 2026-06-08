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
    TreeNode prin(TreeNode root){
        if(root == null) return null ; 
        TreeNode dummy = root.left;
        root.left = root.right;
        root.right = dummy;
        prin(root.left);
        prin(root.right);
        return root;

    }
    public TreeNode invertTree(TreeNode root) {
        return prin(root);
    }
}
