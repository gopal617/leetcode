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
    public ListNode swapPairs(ListNode head) {
        ListNode dum= new ListNode(0);
        dum.next=head;
        ListNode prev=dum;
        while(prev.next!=null && prev.next.next!=null){
            ListNode fir=prev.next;
            ListNode sec=fir.next;
            prev.next=sec;
            fir.next=sec.next;
            sec.next=fir;
            prev=fir;
        }
        return dum.next;
    }
}