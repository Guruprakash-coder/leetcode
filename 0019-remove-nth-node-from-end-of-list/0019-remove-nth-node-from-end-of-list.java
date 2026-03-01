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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int cnt=0;
        ListNode last=head;
        while(last!=null){
            cnt++;
            last=last.next;
        }
        if(cnt==n){
            return head.next;
        }
        ListNode temp=head;
        n=cnt-n-1;
        
        for(int i=0;i<n;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}