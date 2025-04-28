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
        ListNode head1=l1;
        ListNode head2=l2;

        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        int one=0;
        while(head1!=null && head2!=null){
           int sum=head1.val+head2.val+one;
           int rem=(sum>9)?sum%10:sum;
           one=(sum>9)?1:0;
           temp.next=new ListNode(rem);
           head1=head1.next;
           head2=head2.next;
           temp=temp.next;
        }

        while(head1!=null){
           int sum=head1.val+one;
           if(sum>9){
            temp.next=new ListNode(sum%10);
            one=1;
           }else{
            temp.next=new ListNode(sum);
            one=0;
           }
           temp=temp.next;
           head1=head1.next;
        }

        while(head2!=null){
           int sum=head2.val+one;
           if(sum>9){
            temp.next=new ListNode(sum%10);
            one=1;
           }else{
            temp.next=new ListNode(sum);
            one=0;
           }
           temp=temp.next;
           head2=head2.next;
        }

        if(one==1){
            temp.next=new ListNode(1);
            temp=temp.next;
        }

        return dummy.next;
    }
}
