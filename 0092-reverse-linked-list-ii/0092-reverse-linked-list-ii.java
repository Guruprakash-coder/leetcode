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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode prev=null;
        ListNode pres=head;
        
        for(int i=0;pres!=null && i<left-1;i++){
            prev=pres;
            pres=pres.next;
            
        }
        ListNode last=prev;
        ListNode newEnd=pres;
        ListNode Next=pres.next;
        for(int i=0;i<right-left+1;i++){
            pres.next=prev;

            prev=pres;
            pres=Next;
            if(Next!=null){
                Next=Next.next;
            }
            

        }
        if(last!=null){
            last.next=prev;
        }else{
            head=prev;
        }

        newEnd.next=pres;
        return head;

    }
}