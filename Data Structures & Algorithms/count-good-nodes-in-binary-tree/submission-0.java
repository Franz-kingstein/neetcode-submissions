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
    public int goodNodes(TreeNode root) {
        int count = 0;
        if(root == null) return 0;
        Deque<TreeNode> s = new ArrayDeque<>();
        Deque<Integer> max = new ArrayDeque<>();
        s.push(root);
        max.push(root.val);
        while(!s.isEmpty()){
            TreeNode node = s.pop();
            int maxi = max.pop();
            if(node.val >= maxi){
                count++;
                maxi = node.val;
            }
            if(node.right != null){
                s.push(node.right);
                max.push(maxi);
            }
            if(node.left != null){
                s.push(node.left);
                max.push(maxi);
            }
        }
        return count;


        
    }
}
