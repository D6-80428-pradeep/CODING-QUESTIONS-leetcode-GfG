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
    public ListNode sortList(ListNode head) {
        if(head==null) return head;
        List<Integer>list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(list);
        
        ListNode ans=new ListNode(list.get(0));
         temp=ans;
        for(int i=1;i<list.size();i++){
            ListNode newnode=new ListNode(list.get(i));
            temp.next=newnode;
            temp=temp.next;
        }
        return ans;
    }
}