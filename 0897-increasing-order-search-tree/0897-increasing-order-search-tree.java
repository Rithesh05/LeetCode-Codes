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
    ArrayList<TreeNode> tree=new ArrayList<>();
    void BFS(TreeNode root){
        if(root==null){
            return;
        }
        BFS(root.left);
        tree.add(root);
        BFS(root.right);
    }
    public TreeNode increasingBST(TreeNode root) {
        if(root==null){
            return null;
        }
        BFS(root);
        TreeNode ans=tree.get(0);
        TreeNode temp=ans;
        temp.right=null;
        for(int i=1;i<tree.size();i++){
            temp.right=tree.get(i);
            temp.right.left=null;
            temp=temp.right;
        }
        return ans;
    }
}