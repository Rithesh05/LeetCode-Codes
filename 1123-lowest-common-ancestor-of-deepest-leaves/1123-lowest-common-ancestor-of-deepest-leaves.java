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
    int height(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(height(root.right),height(root.left));
    }
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        int left=height(root.left);
        int right=height(root.right);
        if(left==right) return root;
        TreeNode curr;
        if(left>right){
            curr=lcaDeepestLeaves(root.left);
        }else{
            curr=lcaDeepestLeaves(root.right);
        }
        return curr;
    }
}