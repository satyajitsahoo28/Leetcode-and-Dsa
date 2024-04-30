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
    public ListNode reverse(ListNode head,ListNode upto){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=upto){
            ListNode nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        head=prev;
        return head;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null || k==1){
            return head;
        }
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode point=dummy;
        ListNode curr=head;
        while(point!=null){
            int count=0;
            while(count<k && curr!=null){
                curr=curr.next;
                ++count;
            }

            if(count!=k){
                break;
            }

            ListNode last=point.next;
            point.next=reverse(point.next,curr);
            last.next=curr;
            point=last;
        }
        return dummy.next;
        
    }
}