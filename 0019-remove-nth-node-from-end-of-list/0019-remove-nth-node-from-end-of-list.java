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

        ListNode curr=head;
        
        int length=0;
        while(curr!=null){
           length++;
           curr=curr.next;
        }
        int d=length-n-1;
        if(length==1 && n==1){
            head=null;
            return head;
        }
        if(d==-1) return head.next;
        ListNode prev=head;
        while(d!=0){
            prev=prev.next;
            d--;
        }
        prev.next=prev.next.next;
       return head;
    }
}