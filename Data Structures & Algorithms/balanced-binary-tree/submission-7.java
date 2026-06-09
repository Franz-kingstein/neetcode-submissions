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
    
    int maxDepth(TreeNode root){
        if(root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left,right) + 1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null || root.left == null && root.right == null) return true;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        //if(left == right) return true;
        System.out.println(left - right);
        return (Math.abs(left-right) <= 1 && isBalanced(root.left) && isBalanced(root.right));

        
    }
}
