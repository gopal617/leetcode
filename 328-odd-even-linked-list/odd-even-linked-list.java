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
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
       ListNode odd= head;
       ListNode evn=odd.next;
       ListNode evnh=evn;
       while(evn!=null && evn.next!=null){
        odd.next=evn.next;
        odd=odd.next;
        evn.next=odd.next;
        evn=evn.next;
       }
       odd.next=evnh;
       return head;
    }
}