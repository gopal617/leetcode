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
    public List<Integer> preorderTraversal(TreeNode root) {
        dfs(root);
        return l;
    }
    private void dfs(TreeNode t){
        if(t==null) return;
        l.add(t.val);
        dfs(t.left);
        dfs(t.right);
    }
}