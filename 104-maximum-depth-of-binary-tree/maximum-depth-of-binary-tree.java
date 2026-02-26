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
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int levels=-1;
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        while(true){
            int ncount=q.size();
            if(ncount==0){
                return levels+1;
            }
            while(ncount>0){
                TreeNode ele= q.poll();
                if(ele.left!=null){
                    q.add(ele.left);
                }
                if(ele.right!=null){
                    q.add(ele.right);
                }
                ncount--;
            }
            levels++;
        }
    }
}