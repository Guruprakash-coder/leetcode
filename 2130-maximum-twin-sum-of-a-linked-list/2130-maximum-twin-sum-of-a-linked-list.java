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
    public int pairSum(ListNode head) {
        
        
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null){
            
            slow=slow.next;
            fast=fast.next.next;
        }
        
        slow=rev(slow);
        int max=Integer.MIN_VALUE;
        
        ListNode temp=head;
        
        while(slow!=null){
            
            max=Math.max((slow.val+temp.val),max);
            slow=slow.next;
            temp=temp.next;
        }
        return max;
    }
    private ListNode rev(ListNode node){
        if(node==null || node.next==null){
            return node;
        }
        ListNode prev=null;
        ListNode curr=node;
        ListNode Next=curr.next;
        while(curr!=null){
            if(Next==null){
                node=curr;
            }
            curr.next=prev;    
            prev=curr;
            curr=Next;
            if(Next!=null){
                Next=Next.next;
            }
        }
        return node;
    }
}