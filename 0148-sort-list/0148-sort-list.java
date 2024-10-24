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
    public ListNode sortList(ListNode head) {
        ListNode curr=head;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        while(curr!=null){
            pq.add(curr.val);
            curr=curr.next;
        }

        ListNode dummy=new ListNode(-1);
        ListNode point=dummy;
        while(!pq.isEmpty()){
            ListNode temp=new ListNode(pq.remove());
            point.next=temp;
            point=point.next;
        }
        return dummy.next;
        
    }
}