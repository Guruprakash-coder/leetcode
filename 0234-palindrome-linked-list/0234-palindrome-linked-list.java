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
        ListNode mid=middleNode(head);
        ListNode headsecond=reverseList(mid);
        ListNode rereverse=headsecond;
        while(head!=null && headsecond!=null){
            if(head.val!=headsecond.val){
                return false;
            }
            head=head.next;
            headsecond=headsecond.next;
        }
        rereverse=reverseList(rereverse);
        return true;

    }
    public ListNode reverseList(ListNode node){
        ListNode prev=null;
        ListNode pres=node;
        ListNode Next=pres.next;

        while(pres!=null){
            pres.next=prev;
            prev=pres;
            pres=Next;
            if(Next!=null){
                Next=Next.next;
            }
            
        }
        node=prev;
        return node;


    }
    public ListNode middleNode(ListNode head) {
       ListNode slow=head;
       ListNode fast=head; 
       while(fast!=null && fast.next!= null){
        ListNode temp=slow.next;
        slow=temp;
        temp=fast.next.next;
        fast=temp;

       }

       return slow;
    }
}