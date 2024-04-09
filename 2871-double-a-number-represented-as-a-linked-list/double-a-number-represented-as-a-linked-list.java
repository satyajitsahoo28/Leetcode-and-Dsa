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
    public ListNode doubleIt(ListNode head) {
        if(head==null){
            return head;
        }
        Stack<ListNode> s=new Stack<>();
        ListNode curr=head;
        while(curr!=null){
            s.push(curr);
            curr=curr.next;
        }
        int carry=0;
        while(!s.isEmpty()){
            ListNode popped=(ListNode) s.pop();
            int doubleVal=popped.val*2+carry;
            if(doubleVal>9){
                doubleVal=doubleVal%10;
                carry=1;
            }
            else{
                carry=0;
            }
            popped.val=doubleVal;
        }

        if(carry==1){
            ListNode newNode=new ListNode(1);
            newNode.next=head;
            head=newNode;
        }

        return head;
        
    }
}