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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> t1= new LinkedList<>();
        Queue<TreeNode> t2 = new LinkedList<>();
        t1.add(p);
        t2.add(q);
        while((!t1.isEmpty()) || (!t2.isEmpty())){
            TreeNode tr1 = t1.poll();
            TreeNode tr2 = t2.poll(); 
            if(tr1== null && tr2==null) continue;
            if(tr1==null || tr2==null) return false;
            if(tr1.val != tr2.val ) return false;
            t1.add(tr1.left);
            t1.add(tr1.right);
            t2.add(tr2.left);
            t2.add(tr2.right);
        }
        return true;
    }
}