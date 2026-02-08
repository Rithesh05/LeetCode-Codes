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
    TreeNode BuildTreeNode(int[] inorder,int[] postorder){
        if(inorder.length==0){
            return null;
        }
        //create node
        TreeNode root=new TreeNode(postorder[postorder.length-1]);
        int k=0;
        while(inorder[k]!=postorder[postorder.length-1]){
            k++;
        }
        //left
        int[] leftinorder=Arrays.copyOfRange(inorder,0,k);
        int[] leftpostorder=Arrays.copyOfRange(postorder,0,k);
        root.left=BuildTreeNode(leftinorder,leftpostorder);

        //right
        int[] rightinorder=Arrays.copyOfRange(inorder,k+1,inorder.length);
        int[] rightpostorder=Arrays.copyOfRange(postorder,k,postorder.length-1);
        root.right=BuildTreeNode(rightinorder,rightpostorder);

        //return 
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return BuildTreeNode(inorder,postorder);
    }
}