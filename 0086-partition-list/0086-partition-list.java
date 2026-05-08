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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode fhead=new ListNode(0);
        ListNode shead=new ListNode(0);
        ListNode temp=head;
        ListNode temp1=fhead;
        ListNode temp2=shead;
        while(temp!=null){
            if(temp.val<x){
                temp1.next=temp;
                temp1=temp1.next;
            }else{
                temp2.next=temp;
                temp2=temp2.next;
            }
            temp=temp.next;
        }
        temp1.next=shead.next;
        temp2.next=null;
        return fhead.next;

    }
}