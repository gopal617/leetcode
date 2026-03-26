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
    int sum=0;
    public int sumRootToLeaf(TreeNode root) {
        dfs(root,new StringBuilder());
        return sum;
    }
    private void dfs(TreeNode t,StringBuilder sb){
        if(t.left==null && t.right==null){
            sb.append(t.val);
            String s= sb.toString();
            sum+=Integer.parseInt(s,2);
            return;
        }
        sb.append(t.val);
        if(t.left!=null){
            dfs(t.left,sb);
             sb.deleteCharAt(sb.length()-1);
        }
        if(t.right!=null){
            dfs(t.right,sb);
             sb.deleteCharAt(sb.length()-1);
        }


    }
}