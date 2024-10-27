/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode head1=headA;
        ListNode head2=headB;

        while(head1!=head2){

            head1=(head1==null)?headB:head1.next;
            head2=(head2==null)?headA:head2.next;
        }

        return head1;
    }
}