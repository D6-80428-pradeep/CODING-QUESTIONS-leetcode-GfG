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

    public int travers(TreeNode root,int nu){
        if(root==null){
            return 0;
        }
        nu=nu*10+root.val;
        if(root.left==null && root.right==null){
            return nu;
        }
        return travers(root.left,nu)+travers(root.right,nu);    
    }
    public int sumNumbers(TreeNode root) {
        return travers(root,0); 
    }
}