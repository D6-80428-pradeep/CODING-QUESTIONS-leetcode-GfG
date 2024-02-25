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
        ListNode trav=head;
        // int count=0;
        // while(trav!=null){
        //     trav=trav.next;
        //     count++;
        // }
        // System.out.println(count);
        List<Integer> list=new ArrayList<>();
        while(trav!=null){
            list.add(trav.val);
            trav=trav.next;    
        }
        int end=list.size()-1;
        for(int i=0;i<list.size();i++){
             if(list.get(i)==list.get(end)){
                 end--;
        }else{
            return false;
        }
        }

        return true;
    }
}