class Solution {
    int sum = Integer.MIN_VALUE;

    int maxsum(TreeNode root){
        if(root == null) return 0;

        int left = Math.max(0, maxsum(root.left));
        int right = Math.max(0, maxsum(root.right));

        // step 2: best path passing through this node
        sum = Math.max(sum, left + right + root.val);

        // step 1: best single path going upward
        return root.val + Math.max(left, right);
    }

    public int maxPathSum(TreeNode root) {
        maxsum(root);
        return sum;
    }
}
