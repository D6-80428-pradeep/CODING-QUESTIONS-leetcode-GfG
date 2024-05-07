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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null) return ans;
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer>nn=new ArrayList<>();
            for(int i =0; i<size; i++){
                TreeNode current = q.remove();
                
                nn.add(current.val);
                
                if(current.right != null){
                    q.offer(current.right);
                }
                
                if(current.left != null){
                    q.offer(current.left);
                }
            }
            Collections.reverse(nn);
            ans.add(nn);
        }
        Collections.reverse(ans);
        return ans;
    }
}