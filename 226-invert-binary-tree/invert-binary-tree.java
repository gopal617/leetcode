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
        if(root==null) return root;
        dfs(root);
        return root;
    }
    private void dfs(TreeNode t){
        if(t.left==null && t.right==null) return;
        TreeNode tem=t.right;
        t.right=t.left;
        t.left=tem;
        if(t.left!=null) dfs(t.left);
       if(t.right!=null) dfs(t.right);
        
    }
}