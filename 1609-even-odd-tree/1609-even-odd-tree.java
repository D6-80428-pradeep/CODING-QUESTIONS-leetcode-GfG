/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        if(root==null) return true;

        Queue<TreeNode>q=new LinkedList<>();
        boolean iseven=true;
        q.offer(root);
        
        while(!q.isEmpty()){
            int n=q.size();
            int prev=iseven?Integer.MIN_VALUE:Integer.MAX_VALUE;

            for(int i=0;i<n;i++){
                TreeNode node=q.poll();
                if(iseven){
                if(node.val%2==0 || node.val<=prev){
                    return false;
                }
                }else{
                if(node.val%2!=0 || node.val>=prev){
                    return false;
                }
                }
                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }

                prev=node.val;
            }
            iseven=!iseven;
        }
        return true;
    }
}