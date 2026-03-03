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
    public ListNode sortList(ListNode head) {
      if(head==null || head.next==null){
        return head;
      } 
      ListNode mid=getMid(head);
      ListNode rightside=mid.next;
      mid.next=null;
      ListNode left=sortList(head);
      ListNode right=sortList(rightside);

      return merge(left,right);
    }
    public ListNode getMid(ListNode L){
        ListNode s=L;
        ListNode f=L.next;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode ret;
        if(l1.val<=l2.val){
            ret=l1;
            l1=l1.next;
        }else{
            ret=l2;
            l2=l2.next;
        }
        ListNode tempret=ret;
        while(l1 !=null && l2 !=null){
            if(l1.val<=l2.val){
                tempret.next=l1;
                l1=l1.next;
            }else{
                tempret.next=l2;
                l2=l2.next;
            }
            tempret=tempret.next;
        }
        if(l1!=null){
            tempret.next=l1;
        }else{
            tempret.next=l2;
        }
        return ret;

    }
}