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
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }
    public ListNode reverse(ListNode head){
        if(head==null){}
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
    public int pairSum(ListNode head) {
        ListNode mid=findMid(head);
        ListNode rp=reverse(mid);
        ListNode lp=head;

        int twinSum=0;
        while(rp!=null){
            int sum=lp.val+rp.val;
            twinSum=Math.max(twinSum,sum);
            lp=lp.next;
            rp=rp.next;
        }

        return twinSum;
        
    }
}