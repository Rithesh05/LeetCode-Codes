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
    ArrayList<Integer> list=new ArrayList<>();
    boolean isroot(TreeNode root){
        if(root.right==null && root.left==null){
            return true;
        }
        return false;
    }
    void add(TreeNode root,int prev){
        if(root==null){
            return;
        }
        prev=prev*10+root.val;
        if(isroot(root)){
            list.add(prev);
        }
       if(root.left!=null) add(root.left,prev);
       if(root.right!=null) add(root.right,prev);
        prev=prev/10;
    }
    public int sumNumbers(TreeNode root) {
    add(root,0);
    int sum=0;
    for(int t:list){
        System.out.print(t+" ");
        sum=sum+t;
    }
    return sum;
    }
}