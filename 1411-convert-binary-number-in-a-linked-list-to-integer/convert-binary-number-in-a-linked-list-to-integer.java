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
    public int length(ListNode head){
        int len=0;
        ListNode curr=head;
        while(curr!=null){
            len++;
            curr=curr.next;
        }
        return len;
    }
    public int getDecimalValue(ListNode head) {
        int len=length(head)-1;
        ListNode temp=head;
        int ans=0;
        while(temp!=null){
            if(temp.val==1){
                ans+=Math.pow(2,len);
                len--;
                temp=temp.next;
            }
            else if(temp.val==0){
                len--;
                temp=temp.next;
            }
        }
        return ans;
    }
}