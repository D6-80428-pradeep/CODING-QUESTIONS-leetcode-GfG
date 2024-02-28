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
    public int maxdepth=-1;
    public int ans=0;
    public int findBottomLeftValue(TreeNode root) {

        find(root,0);
        return ans;
    }

    public void find(TreeNode root,int depth){
        if(root==null){
           return;
        } 
        if(depth>maxdepth){
            maxdepth=depth;
            ans=root.val;
        }

      find(root.left,depth+1);
      find(root.right,depth+1);
    }
}