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
    int msum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return msum;
    }
    private int dfs(TreeNode t ){
        if(t==null) return 0;
        int left=Math.max(0,dfs(t.left));
        int right= Math.max(0,dfs(t.right));
        int csum=left+right+t.val;
        msum=Math.max(msum,csum);
        return t.val+Math.max(left,right);
    }
}