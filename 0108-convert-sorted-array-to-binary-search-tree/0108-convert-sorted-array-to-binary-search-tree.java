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
    public TreeNode DAC(int[] nums,int l,int r){
        if(l>r){
            return null;
        }
        int mid=l+(r-l)/2;
        TreeNode newnode=new TreeNode(nums[mid]);
        newnode.left=DAC(nums,l,mid-1);
        newnode.right=DAC(nums,mid+1,r);
        return newnode;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return DAC(nums,0,nums.length-1);
    }
}