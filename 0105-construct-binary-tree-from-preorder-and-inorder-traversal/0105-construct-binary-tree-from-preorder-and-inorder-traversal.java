import java.util.Arrays;

class Solution {

    TreeNode buildTreeans(int[] pre, int[] in) {
        if (pre.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(pre[0]);

        // find root index in inorder
        int k = 0;
        while (in[k] != pre[0]) {
            k++;
        }

        // left subtree
        int[] lin = Arrays.copyOfRange(in, 0, k);
        int[] lpre = Arrays.copyOfRange(pre, 1, k + 1);

        // right subtree
        int[] rin = Arrays.copyOfRange(in, k + 1, in.length);
        int[] rpre = Arrays.copyOfRange(pre, k + 1, pre.length);

        root.left = buildTreeans(lpre, lin);
        root.right = buildTreeans(rpre, rin);

        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeans(preorder, inorder);
    }
}
