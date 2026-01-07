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
    List<List<Integer>> ans = new ArrayList<>();

    void findpath(TreeNode root, int targetSum, List<Integer> temp) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null && root.val - targetSum == 0) {
            temp.add(root.val);
            ans.add(new ArrayList<>(temp));
            temp.remove(temp.size()-1);
            return;
        }
        temp.add(root.val);
        findpath(root.left, targetSum - root.val, temp);
        findpath(root.right, targetSum - root.val, temp);
        temp.remove(temp.size() - 1);
        return;
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> temp = new ArrayList<>();
        findpath(root, targetSum, temp);
        return ans;
    }
}