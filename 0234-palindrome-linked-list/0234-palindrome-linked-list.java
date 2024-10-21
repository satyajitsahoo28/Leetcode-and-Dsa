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
    public ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        ListNode prevNode=null;
        ListNode currNode=head;
        while(currNode!=null){
            ListNode nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }
        head=prevNode;
        return head;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode head1=head;
        ListNode mid=middle(head);
        ListNode head2=reverse(mid);
        while(head2!=null){
            if(head1.val!=head2.val){
                return false;
            }
            head1=head1.next;
            head2=head2.next;
        }

        return true;
        
    }
}