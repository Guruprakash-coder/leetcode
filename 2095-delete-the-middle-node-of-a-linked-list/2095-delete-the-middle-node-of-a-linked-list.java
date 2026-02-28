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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
         ListNode slow=head;
       ListNode fast=head;
       ListNode prev=null; 
       while(fast!=null && fast.next!= null){
        prev=slow;
        ListNode temp=slow.next;
        slow=temp;
        temp=fast.next.next;
        fast=temp;
       }
       prev.next=slow.next;
       return head;


    }
}