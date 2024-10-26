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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            length++;
            curr = curr.next;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        curr = dummy;
        int cnt=0;
        while (cnt < length - n) {
            curr = curr.next;
            cnt++;
        }
        curr.next = curr.next.next;
        return dummy.next;
    }
}
