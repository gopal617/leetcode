/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null) return null;
        ListNode tail= head;
        int len=1;
        while(tail.next!=null){
            len++;
            tail=tail.next;
        }
        if(n==len) return head.next;
        int k=len-n;
        ListNode node=head;
        for(int i=0;i<k-1;i++){
            node=node.next;
        }
        node.next=node.next.next;

        return head;
    }
}