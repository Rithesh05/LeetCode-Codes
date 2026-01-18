class Pair {
    TreeNode node;
    long index;

    Pair(TreeNode node, long index) {
        this.node = node;
        this.index = index;
    }
}

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));

        int maxWidth = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            long minIndex = q.peek().index; // normalize
            long first = 0, last = 0;

            for (int i = 0; i < size; i++) {
                Pair curr = q.poll();
                long idx = curr.index - minIndex;

                if (i == 0) first = idx;
                if (i == size - 1) last = idx;

                if (curr.node.left != null)
                    q.add(new Pair(curr.node.left, idx * 2));

                if (curr.node.right != null)
                    q.add(new Pair(curr.node.right, idx * 2 + 1));

                maxWidth = Math.max(maxWidth, (int)(last - first + 1));
            }

            
        }
        return maxWidth;
    }
}
