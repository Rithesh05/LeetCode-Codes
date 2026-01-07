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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> zz=new ArrayList<>();
        if(root==null) return zz;
        Queue<TreeNode> q=new LinkedList<>();
        ArrayList<Integer> level=new ArrayList<>();
        boolean flag=true;
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr==null){
                if(!flag){
                    Collections.reverse(level);
                }
                if(!q.isEmpty()){
                    q.add(null);
                }
                zz.add(new ArrayList<>(level));
                level.clear();
                flag=!flag;
            }else{
                level.add(curr.val);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }   
        }
        return zz;
    }
}