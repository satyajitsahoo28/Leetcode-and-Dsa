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
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode point=dummy;

        while(point.next!=null && point.next.next!=null){
            ListNode slow=point.next;
            ListNode fast=point.next.next;

            slow.next=fast.next;
            fast.next=slow;
            point.next=fast;
            point=slow;
        }
        return dummy.next;
        
    }
}