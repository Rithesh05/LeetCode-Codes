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
class Pair{
    TreeNode node;
    int state;
    Pair(TreeNode node,int state){
        this.node=node;
        this.state=state;
    }
}
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        Stack<Pair> st=new Stack<>();
        st.add(new Pair(root,0));
        int sum=0;
        while(!st.isEmpty()){
            Pair cp=st.pop();
            TreeNode curr=cp.node;
            if(cp.state==-1 && curr.left==null && curr.right==null){
                sum=sum+curr.val;
            }
            if(curr.left!=null) st.add(new Pair(curr.left,-1));
            if(curr.right!=null) st.add(new Pair(curr.right,0));
        }
        return sum;
    }
}