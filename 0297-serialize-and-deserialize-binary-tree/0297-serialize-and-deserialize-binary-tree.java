/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "";

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        String ans = "";

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();

            if (curr == null) {
                ans = ans + "#,";
                continue;
            }

            ans = ans + curr.val + ",";

            q.add(curr.left);
            q.add(curr.right);
        }
        System.out.println(ans);
        return ans;
    }



    // Decodes your encoded data to tree.
   public TreeNode deserialize(String data) {
    if (data == null || data.length() == 0) return null;

    String[] arr = data.split(",");
    Queue<TreeNode> q = new LinkedList<>();

    int i = 0;
    TreeNode root = new TreeNode(Integer.parseInt(arr[i]));
    i++;

    q.add(root);

    while (!q.isEmpty() && i < arr.length) {
        TreeNode curr = q.poll();

        // left child
        if (!arr[i].equals("#")) {
            curr.left = new TreeNode(Integer.parseInt(arr[i]));
            q.add(curr.left);
        }
        i++;

        // right child
        if (i < arr.length && !arr[i].equals("#")) {
            curr.right = new TreeNode(Integer.parseInt(arr[i]));
            q.add(curr.right);
        }
        i++;
    }

    return root;
}

}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));