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
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow =slow.next;
            fast=fast.next.next;
        }
        // find the mid 
        // reverse
        // attach from start to mid 
        // attach one by one from start and to the  reverse
         ListNode prev=null;
         ListNode cur=slow.next;
         ListNode next=null;
         slow.next=null;
         while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
         }

         ListNode start=head;
         ListNode mid=prev;
         while(mid!=null){
            ListNode temp1=start.next;
            ListNode temp2=mid.next;
            start.next=mid;
            mid.next=temp1;
            start=temp1;
            mid=temp2;

         }
        


    }
}
