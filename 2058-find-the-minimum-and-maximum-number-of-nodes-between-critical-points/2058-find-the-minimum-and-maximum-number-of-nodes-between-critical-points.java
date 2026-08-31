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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int c1=0;
        int c2=0;
        int min=Integer.MAX_VALUE;
        ListNode prev=head;
        ListNode curr=head.next;
        int ind=1;

        while(curr.next!=null){
            if((prev.val>curr.val && curr.val<curr.next.val)||(prev.val<curr.val && curr.val>curr.next.val)){
                if(c1==0){
                    c1=ind;
                }else{
                    min=Math.min(min,ind-c2);
                    
                }
                c2=ind;
            }
            prev=curr;
            curr=curr.next;
            ind++;
        }

        if(c1==c2) return new int[]{-1,-1};
        return new int[]{min,c2-c1};
    }
}