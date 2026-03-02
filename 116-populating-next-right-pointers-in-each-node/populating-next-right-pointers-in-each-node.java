/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null)  return null;
        Node cur=root;
        while(cur.left!=null){
            Node tem=cur;
            while(tem!=null){
                tem.left.next=tem.right;
                if(tem.next!=null){
                    tem.right.next=tem.next.left;
                }
                tem=tem.next;
            }
            cur=cur.left;
        }
        return root;
    }
}