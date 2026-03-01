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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> l = new ArrayList<>();
        if(root==null) return l;
        Queue <TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean is_left = true;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode t = q.poll();
                if(is_left==true){
                    level.addLast(t.val);
                }
                else{
                    level.addFirst(t.val);
                }
                if(t.left!=null) q.add(t.left);
                if(t.right!=null) q.add(t.right);
            }
            l.add(level);
            is_left = is_left==true ? false:true;
        }
        return l;
    }
}