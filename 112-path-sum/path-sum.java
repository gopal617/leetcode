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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        Queue<TreeNode> q = new LinkedList<>();
        Queue<Integer> sub = new LinkedList<>();
        q.add(root);
        sub.add(root.val);
        while(!(q.isEmpty())){
            TreeNode curr=q.poll();
            int sum = sub.poll();
            if(curr.left== null && curr.right==null){
                if (sum==targetSum) return true;
            }
            if(curr.left!=null){
                q.add(curr.left);
                sub.add(sum+curr.left.val);
            } 
            if(curr.right!=null){
                q.add(curr.right);
                sub.add(sum+curr.right.val);
            }
        }
        return false;
    }
}