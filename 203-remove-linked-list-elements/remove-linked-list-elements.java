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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dum=new ListNode(0);
        dum.next=head;
        ListNode tem=dum;
        while(tem.next!=null){
            if(tem.next.val==val){
                tem.next=tem.next.next;
            }
            else{
                tem=tem.next;
            }
        }
        return dum.next;
    }
}