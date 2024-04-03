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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null || l2==null){
            return null;
        }

        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        int carry=0;
        while(l1!=null && l2!=null){
            int sum=l1.val+l2.val+carry;
            if(sum>9){
                ListNode ans1=new ListNode(sum%10);
                curr.next=ans1;
                carry=1;
            }

            else{
                ListNode ans2=new ListNode(sum);
                curr.next=ans2;
                carry=0;
                carry=0;
            }
            l1=l1.next;
            l2=l2.next;
            curr=curr.next;
        }
        //if l1 or l2 list is size not equal 
        while(l1!=null){
            int sum=l1.val+carry;
            if(sum>9){
                ListNode ans1=new ListNode(sum%10);
                curr.next=ans1;
                carry=1;
            }

            else{
                ListNode ans2=new ListNode(sum);
                curr.next=ans2;
                carry=0;
            }
            l1=l1.next;
            curr=curr.next;
        }
        while(l2!=null){
            int sum=l2.val+carry;
            if(sum>9){
                ListNode ans1=new ListNode(sum%10);
                curr.next=ans1;
                carry=1;
            }

            else{
                ListNode ans2=new ListNode(sum);
                curr.next=ans2;
                carry=0;
            }
            curr=curr.next;
            l2=l2.next;
        }

        if(carry==1){
            ListNode ans3=new ListNode(carry);
            curr.next=ans3;
        }

        return dummy.next;
        
    }
}