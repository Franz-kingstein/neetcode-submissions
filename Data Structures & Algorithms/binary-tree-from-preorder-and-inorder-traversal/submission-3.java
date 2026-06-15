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
    HashMap<Integer,Integer> hm;
    int index = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        hm = new HashMap<>();
        for(int i = 0; i < inorder.length;i++){
            hm.put(inorder[i],i);
        }
        return helper(preorder,0,preorder.length-1);
        
    }
    TreeNode helper(int[] preorder,int start,int end){
        if(start > end) return null;
        
        int rootval = preorder[index++];
        TreeNode root = new TreeNode(rootval);

        int inindex = hm.get(rootval);
        root.left = helper(preorder,start,inindex-1);
        root.right = helper(preorder,inindex+1,end);
        return root;

    }
}
