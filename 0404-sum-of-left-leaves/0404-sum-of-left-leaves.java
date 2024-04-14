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
    static int ans;
    public void cal(TreeNode root , boolean flag){
    if(root==null) return;
    if(flag && root.left==null && root.right==null) ans+=root.val;
    cal(root.left,true);
    cal(root.right,false);
    }
    public int sumOfLeftLeaves(TreeNode root) {
         ans=0;
        cal(root.left,true);
        cal(root.right,false);
        return ans; 
    }
}