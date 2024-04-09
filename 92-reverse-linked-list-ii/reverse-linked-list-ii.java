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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }
        
        // Dummy node to simplify the reversal process
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        // Find the (left - 1)th node
        ListNode f1 = dummy;
        for (int i = 0; i < left - 1; i++) {
            f1 = f1.next;
        }
        
        // Find the rightmost node of the range
        ListNode b1 = dummy;
        for (int i = 0; i < right; i++) {
            b1 = b1.next;
        }
        
        // Separate the range to be reversed
        ListNode leftPartEnd = f1.next;
        ListNode rightPartStart = b1.next;
        f1.next = null; // Disconnect the left part
        b1.next = null; // Disconnect the right part
        
        // Reverse the range
        reverseList(leftPartEnd);
        
        // Reconnect the reversed range back to the original list
        f1.next = b1;
        leftPartEnd.next = rightPartStart;
        
        return dummy.next;
    }
    
    private void reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode nextNode;
        
        while (curr != null) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
}
}