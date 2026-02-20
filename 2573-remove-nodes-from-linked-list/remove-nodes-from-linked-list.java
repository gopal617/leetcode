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
    public ListNode removeNodes(ListNode head) {
        ListNode h1= reverse(head);
        int ma= h1.val;
        ListNode curr1= h1;
        while(curr1!=null && curr1.next!=null){
            if(curr1.next.val<ma){
                curr1.next=curr1.next.next;
            }
            else{
                ma=curr1.next.val;
                curr1=curr1.next;
            }
        }
        return reverse(h1);
    }
     private ListNode reverse(ListNode head){
            ListNode prev= null;
            ListNode curr=head;
            while(curr!=null){
                ListNode next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            return prev;
        }

}