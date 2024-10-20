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
    public ListNode reverse(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;
    while (curr != null) {
        ListNode nextNode = curr.next;
        curr.next = prev;
        prev = curr;
        curr = nextNode;
    }
    return prev;
}

    public void reorderList(ListNode head) {
        ListNode mid=findMid(head);
        ListNode head1=head;
        ListNode head2=reverse(mid);
        while(head1.next!=null && head2.next!=null){
            if(head1.next!=null){
                ListNode temp1=head1.next;
                head1.next=head2;
                head1=temp1;
            }

            if(head2.next!=null){
                ListNode temp2=head2.next;
                head2.next=head1;
                head2=temp2;
            }
        }
    }
}