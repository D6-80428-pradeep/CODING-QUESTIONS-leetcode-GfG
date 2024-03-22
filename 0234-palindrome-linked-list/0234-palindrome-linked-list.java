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
    public boolean isPalindrome(ListNode head) {
        
        ListNode curr=head;
        StringBuilder sb=new StringBuilder();
        
        while(curr!=null){
            sb.append(curr.val);
            curr=curr.next;
        }
        
        String ss=sb.toString();
        System.out.println(sb);
        System.out.println(ss);
        
        if(sb.reverse().toString().equals(ss)) return true;
        return false;
        
    }
}