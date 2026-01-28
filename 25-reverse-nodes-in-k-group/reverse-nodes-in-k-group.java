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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy= new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        while(true){
            ListNode pre= prev;
            for(int i=0;i<k;i++){
                pre=pre.next;
                if(pre==null) return dummy.next;
            }
            ListNode curr= prev.next;
            for(int i=0;i<k-1;i++){
                ListNode temp= curr.next;
                curr.next=temp.next;
                temp.next=prev.next;
                prev.next=temp;
            }
            prev=curr;
        }
    }
}