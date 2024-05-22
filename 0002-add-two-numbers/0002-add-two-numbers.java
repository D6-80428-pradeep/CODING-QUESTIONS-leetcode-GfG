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
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}
// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode curr1=l1;
//        ListNode curr2=l2;
//        ListNode liis=new ListNode(0);
//        ListNode ans=liis;
//        int l11=0;
//        if(l1.val==0 && l1.next==null && l2.next==null && l2.val==0) return liis;
//        if(l1.val==0 && l1.next==null) return l2;
//        if(l2.val==0 && l2.next==null) return l1;
//        while(curr1!=null){
//           l11=10*l11+curr1.val;
//           curr1=curr1.next;
//        }
//        System.out.println(l11);
//        int l22=0;
//        while(curr2!=null){
//           l22=10*l22+curr2.val;
//           curr2=curr2.next;
//        }
//        System.out.println(l22);
//        int sum=l11+l22;
//        System.out.println(sum);
       
//        while(sum!=0){
//            int t=sum%10;
//            sum/=10;
//            ListNode neww=new ListNode(t);
//            ans.next=neww;
//            ans=ans.next;
//        }
//        return liis.next;
//     }
// }
