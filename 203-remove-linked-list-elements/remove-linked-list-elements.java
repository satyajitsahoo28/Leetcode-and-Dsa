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
    public ListNode removeElements(ListNode head, int val) {
    if(head==null){
        return head;
    }

    ListNode prev=new ListNode(0);
    ListNode p=prev;
    ListNode curr=head;

    while(curr!=null){
        if(curr.val==val){
            p.next=curr.next;
        }
        else{
            p.next=curr;
            p=curr;
        }
        curr=curr.next;
    }
    return prev.next;
        
    }
}