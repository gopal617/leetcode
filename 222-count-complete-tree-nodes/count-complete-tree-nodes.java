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
    int count=0;
    public int countNodes(TreeNode root) {
        if(root==null) return count;
        dfs(root);
        return count+1 ;
    }
    private int dfs(TreeNode t){
        if (t==null) return 0;
        int left = Math.max(dfs(t.left),0);
        int right =  Math.max(dfs(t.right),0);
        count=left+right;
        return 1+count;
    }
}