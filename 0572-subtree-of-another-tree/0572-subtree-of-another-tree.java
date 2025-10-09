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
    public boolean check(TreeNode root,TreeNode subroot){
        if(root==null && subroot==null){
            return true;
        }
        if(root==null || subroot==null){
            return false;
        }
        if(root.val!=subroot.val){
            return false;
        }
        boolean left=check(root.left,subroot.left);
        boolean right=check(root.right,subroot.right);
        return left&&right;
    }
    public boolean isSubtree(TreeNode root, TreeNode subroot) {
        if(root==null && subroot!=null){
            return false;
        }
        if(check(root,subroot)) return true;
        boolean left=isSubtree(root.left,subroot);
        boolean right=isSubtree(root.right,subroot);
        return left||right;
    }
}