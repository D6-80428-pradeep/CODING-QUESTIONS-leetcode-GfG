/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<Integer> ans = new ArrayList();
    int k;
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        this.k = k;
        find(root, target.val, 0);
        return ans;
    }
    int find(TreeNode root, int target, int depth) {
        if (root == null) {
            return -1;
        }
        if (root.val == target) {
            traverse(root, 0, k);
            return depth;
        }
        int foundDepth = find(root.left, target, depth + 1);
        if (foundDepth != -1) {
            if (foundDepth - depth == k) {
                ans.add(root.val);
            } else if (foundDepth - depth < k) {
                traverse(root.right, 1, k - (foundDepth - depth));
            }
            return foundDepth;
        }
        foundDepth = find(root.right, target, depth + 1);
        if (foundDepth != -1) {
            if (foundDepth - depth == k) {
                ans.add(root.val);
            } else if (foundDepth - depth < k) {
                traverse(root.left, 1, k - (foundDepth - depth));
            }
        }
        return foundDepth;
    }
    void traverse(TreeNode root, int depth, int targetDepth) {
        if (root == null) {
            return;
        }
        if (depth == targetDepth) {
            ans.add(root.val);
            return;
        }
        traverse(root.left, depth + 1, targetDepth);
        traverse(root.right, depth + 1, targetDepth);
    }
}