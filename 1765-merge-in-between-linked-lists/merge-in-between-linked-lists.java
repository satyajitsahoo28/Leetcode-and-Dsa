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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode f1=list1;
        ListNode b1=list1;

        ListNode f2=list2;
        ListNode b2=list2;

        int i=1,j=0;
        while(i<a){
            i++;
            f1=f1.next;
        }

        while(j<b+1){
            j++;
            b1=b1.next;
        }

        while(b2.next!=null){
            b2=b2.next;
        }

        f1.next=f2;
        b2.next=b1;

        return list1;
        
    }
}