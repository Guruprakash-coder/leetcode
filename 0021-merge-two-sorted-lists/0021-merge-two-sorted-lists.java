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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode ret= mergerLL(list1,list2);
        return ret;
    }
    public ListNode mergerLL(ListNode list1, ListNode list2){
        ListNode ret;
        
         if(list1.val <= list2.val){
            ret=list1;
            list1=list1.next;
        }else{
            ret=list2;
            list2=list2.next;
        }
        
       
        ListNode tempret=ret;
        
        while(list1!= null && list2!=null){
            if(list1.val<=list2.val){
                tempret.next=list1;
                list1=list1.next;
            }else{
                tempret.next=list2;
                list2=list2.next;
            }
            tempret=tempret.next;
        }
        if(list1!=null){
            tempret.next=list1;
        }
        if(list2!=null){
            tempret.next=list2;
        }
        return ret;
    }
}