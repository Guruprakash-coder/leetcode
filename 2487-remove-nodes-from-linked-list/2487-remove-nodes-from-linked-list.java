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
    public ListNode removeNodes(ListNode head) {
        head=reverse(head);
        int v=head.val;
        ListNode prev=head;
        ListNode temp=head.next;
        while(temp!=null){
            if(temp.val<v){
                prev.next=temp.next;
                temp=temp.next;
            }else{
                v=Math.max(v,temp.val);
                prev=temp;
                temp=temp.next;
            }
        }
        return reverse(head);
    }
    public ListNode reverse(ListNode node){
        if(node.next==null){
            return node;
        }
        ListNode newHead=reverse(node.next);
        node.next.next=node;
        node.next=null;

        return newHead;
    }
}