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
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null) return new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int cap = queue.size();
            TreeNode node = queue.poll();
            result.add(node.val);
            if(node.right != null) queue.add(node.right);
            if(node.left != null) queue.add(node.left);
            while(cap > 1){
                TreeNode n = queue.poll();
                if(n == null) continue;
                if(n.right != null) queue.add(n.right);
                if(n.left != null) queue.add(n.left);
                cap--;
            }
        }
        return result;
        
    }
}
