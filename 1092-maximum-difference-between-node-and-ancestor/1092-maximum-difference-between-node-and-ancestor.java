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
    public int bfs(TreeNode root,int max,int min){
        if(root==null){
            return max-min;
        }
        max=Math.max(max,root.val);
        min=Math.min(min,root.val);
       int ltree= bfs(root.left,max,min);
       int rtree= bfs(root.right,max,min);
       return Math.max(rtree,ltree);
    }
    public int maxAncestorDiff(TreeNode root) {
        return bfs(root,0,Integer.MAX_VALUE);
    }
}