// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
class Solution {
    Set<Integer> l = new HashSet<>();
    public boolean findTarget(TreeNode node, int k) {
         if(node==null) return false;
        if(l.contains(k-node.val)) return true;
        l.add(node.val);
        return (findTarget(node.left,k)||findTarget(node.right,k));
    }
   
}