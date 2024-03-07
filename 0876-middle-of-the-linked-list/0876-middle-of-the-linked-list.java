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
    public ListNode middleNode(ListNode head) {
        ListNode curr=head;
        int length=0;
        while(curr!=null){
            length++;
            curr=curr.next;
        }
        System.out.println(length);
        int k=length/2;
        ListNode ans=null;
        int i=0;
        while(head!=null){
            if(i==k){
                ans=head;
            }
            i++;
            head=head.next;
        }
        return ans;
    }
}