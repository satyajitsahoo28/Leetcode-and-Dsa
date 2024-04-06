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
    public ListNode findMid(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode head){
        if(head==null || head.next==null){
            return head;
        }

        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        head=prev;
        return head;
    }
    public void reorderList(ListNode head) {
        ListNode mid=findMid(head);

        ListNode lh=head;
        ListNode rh=reverse(mid);
        ListNode nextL=null;
        ListNode nextR=null;

        while(lh!=null && rh!=null){
            nextL=lh.next;
            lh.next=rh;
            nextR=rh.next;
            rh.next=nextL;
            lh=nextL;
            rh=nextR;
        }
        
    }
}