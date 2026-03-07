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
    void addEl(TreeNode root,ArrayList<Integer> lis){
        if(root==null){
            return;
        }
        lis.add(root.val);
        if(root.right!=null){
            addEl(root.right,lis);
        }
        if(root.left!=null){
            addEl(root.left,lis);
        }
        return;
    }
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> lis=new ArrayList<>();
        addEl(root,lis);
        int n=lis.size();
        for(int i=0;i<n;i++){
            int kavalsinael=k-lis.remove(0);
            if(lis.contains(kavalsinael)){
                return true;
            }
        }
        return false;
    }
}