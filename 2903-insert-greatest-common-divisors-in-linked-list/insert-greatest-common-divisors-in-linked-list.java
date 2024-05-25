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
    int findGcd(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return findGcd(b, a % b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode currNode=head;
        ListNode nextNode=currNode.next;
        while(currNode.next!=null){
            int gcd=findGcd(currNode.val,nextNode.val);
            ListNode gcdNode=new ListNode(gcd);
            currNode.next=gcdNode;
            gcdNode.next=nextNode;
            currNode=nextNode;
            nextNode=nextNode.next;
        }
        return head;
    }
}