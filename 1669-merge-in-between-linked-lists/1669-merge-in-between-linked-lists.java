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
        ListNode p1 = list1;
        for (int i = 0; i < a - 1; i++) {
            p1 = p1.next;
        }
        
        ListNode p2 = p1;
        for (int i = a - 1; i <= b; i++) {
            p2 = p2.next;
        }
        
        ListNode p3 = list2;
        while (p3.next != null) {
            p3 = p3.next;
        }
        
        p1.next = list2;
        p3.next = p2;
        
        return list1;
    }
}