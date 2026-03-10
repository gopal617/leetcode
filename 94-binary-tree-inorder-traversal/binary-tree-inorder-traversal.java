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
    List<Integer> l = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null) return l;
        dfs(root);
        return l;
    }
    private void dfs(TreeNode t){
        if (t==null) return ;
        dfs(t.left);
        l.add(t.val);
        dfs(t.right);
    }
}