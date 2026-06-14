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
        Stack<Integer> s=new Stack<>();
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            s.push(slow.val);
            slow=slow.next;
            fast=fast.next.next;
            
        }
        int max=Integer.MIN_VALUE;
        while(slow!=null){
            int popped=s.pop();
            
            max=Math.max((slow.val+popped),max);
            slow=slow.next;
        }
        return max;

    }
}