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
    int maxsum = Integer.MIN_VALUE;
    //int result = 0;
    //Set<TreeNode> s = new HashSet<>();

    int traverse(TreeNode node){
        int sum = 0;
        if(node == null) return 0;
        int leftsum =Math.max(0,traverse(node.left));
        int rightsum = Math.max(0,traverse(node.right));
        maxsum = Math.max(maxsum,node.val+leftsum+rightsum);
        sum += Math.max(leftsum,rightsum)+node.val;
        return sum;

    }
   /* void subtract(TreeNode node){
        if(node == null) return;
        subtract(node.left);
        subtract(node.right);
        if(s.contains(node)) return;
        s.add(node);
        if(node.val > result) result = node.val;
        sum = sum - node.val;
        //System.out.println(sum + " "  + result);
        if(sum > result && sum != 0) result = sum;

    } */

    public int maxPathSum(TreeNode root) {
        
        traverse(root);
        return maxsum;

        
    }
}
