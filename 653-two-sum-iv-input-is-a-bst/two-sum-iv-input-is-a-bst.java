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
// class Solution {
//     List<Integer> l = new ArrayList<>();
//     public boolean findTarget(TreeNode root, int k) {
//         if(dfs(root,l,k)== true){
//             return true;
//         }
//         return false;
        
//     }
//     private boolean dfs (TreeNode t,List<Integer> l,int k){
//         if(t==null) return ;
//         if(t.left==null && t.right==null) return ;
//         if (l.contains(k-t.val)) return true;
//         else {
//             l.add(t.val);
//         }
//         else if(t.left!=null){
//             dfs(t.left,l,k);
//         } 
//         else if(t.right!=null){
//             dfs(t.right,l,k);
//         }

//     }
// }
class Solution {
    HashSet<Integer> set = new HashSet<>();

    public boolean findTarget(TreeNode root, int k) {
        // Base case: null node
        if (root == null) return false;

        // If complement is found, return true
        if (set.contains(k - root.val)) return true;

        // Otherwise, add current node value to the set
        set.add(root.val);

        // Recurse on left and right subtrees
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}