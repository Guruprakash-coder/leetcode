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
        if(head == null || head.next == null || k == 0){
    return head;
    }
        int length=0;
        ListNode temp=head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        k=k%length;
        if(k==0){
            return head;
        }
        temp=head;
        for(int i=0;i<length-k-1;i++){
            temp=temp.next;
        }
        
        ListNode first=temp.next;
        temp.next=null;
        ListNode last=first;
        System.out.print(last.val);
        while(last.next!=null){
            
            last=last.next;
        }
        
        last.next=head;
        head=first;
        return head;
    }
}