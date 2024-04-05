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
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return head;
        }
        // int idx=0;
        // ListNode evenHead=null;
        // ListNode oddHead=null;
        // ListNode evenTail=null;
        // ListNode oddTail=null;
        // ListNode curr=head;
        // while(curr!=null){
        //     if(idx%2==0){
        //         if(evenHead==null){
        //             evenHead=evenTail=curr;
        //         }
        //         else{
        //             evenTail.next=curr;
        //             evenTail=evenTail.next;
        //         }
        //     }
        //     else{
        //         if(oddHead==null){
        //             oddHead=oddTail=curr;
        //         }
        //         else{
        //             oddTail.next=curr;
        //             oddTail=oddTail.next;
        //         }   
        //     }
        //     curr=curr.next;
        //     idx++;
        // }
        // if(evenTail!=null){
        //        evenTail.next=oddHead;
        // }
        // return evenHead;
        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenHead=even;

        while(even!=null && even.next!=null){
            odd.next=odd.next.next;
            odd=odd.next;

            even.next=even.next.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;
    }
}