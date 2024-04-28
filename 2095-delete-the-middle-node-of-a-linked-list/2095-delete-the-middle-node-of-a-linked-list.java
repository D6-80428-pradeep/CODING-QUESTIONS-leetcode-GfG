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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;
       int l=0;
       ListNode temp=head;
       while(temp!=null){
           l++;
           temp=temp.next;
       }
       int mid=l/2;
       ListNode curr=head;
       
       while(curr!=null){
           mid--;
           if(mid==0){
              curr.next=curr.next.next;
              break;
           }
           curr=curr.next;
       }
       return head;
    }
}