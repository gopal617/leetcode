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
    public boolean isPalindrome(ListNode head) {
        ListNode temp1=head;
        ListNode temp2=head;
        int c=0;
        while(temp2!=null){
            c+=1;
            temp2=temp2.next;
        }
        int t=c;
        c=c/2;
        temp2=head;
        while(c>=0){
            c-=1;
            if(c==0){
                head=temp1.next;
                if(t%2==1){
                    head=head.next;
                }
                temp1.next=null;
                break;
            }
            else{
                temp1=temp1.next;
            }
        }
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        while(temp2 !=null && prev!=null){
            if(temp2.val!=prev.val){
                return false;
            }
            temp2=temp2.next;
            prev=prev.next;
        }
        return true;
    }
}