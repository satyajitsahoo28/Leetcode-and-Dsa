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
    public ListNode partition(ListNode head, int x) {
       ListNode lessHead = new ListNode(0); // Dummy head for the list with values less than x
    ListNode moreHead = new ListNode(0); // Dummy head for the list with values greater than or equal to x
    ListNode lessTail = lessHead;
    ListNode moreTail = moreHead;
    ListNode curr = head;
    
    while (curr != null) {
        if (curr.val < x) {
            lessTail.next = curr;
            lessTail = lessTail.next;
        } else {
            moreTail.next = curr;
            moreTail = moreTail.next;
        }
        curr = curr.next;
    }
    
    // Connect the two lists
    lessTail.next = moreHead.next;
    // Ensure to terminate the end of the more list
    moreTail.next = null;
    
    // Return the head of the less list (excluding the dummy head)
    return lessHead.next;
    }
}