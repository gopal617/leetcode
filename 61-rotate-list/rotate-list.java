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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        int len=1;
        ListNode tail=head;
        while(tail.next!=null){
            len++;
            tail=tail.next;
        }
        if(k%len==0) return head;
        tail.next=head;
        k=k%len;
        int c=len-k;
        while(c!=0){
            if(c==1){
               break;
            }
            else{
            head=head.next;
            c--;
            }
        }
        ListNode newhead=head.next;
        head.next=null;
        return newhead;
        
    }
}