class Pair {
    TreeNode node;
    int dist;
    Pair(TreeNode node, int dist) {
        this.node = node;
        this.dist = dist;
    }
}

class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {

        // Step 1: Parent mapping
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            if (curr.left != null) {
                parent.put(curr.left, curr);
                q.add(curr.left);
            }
            if (curr.right != null) {
                parent.put(curr.right, curr);
                q.add(curr.right);
            }
        }

        // Step 2: BFS from target
        Queue<Pair> bfs = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();
        List<Integer> ans = new ArrayList<>();

        bfs.add(new Pair(target, 0));

        while (!bfs.isEmpty()) {
            Pair curr = bfs.poll();
            TreeNode node = curr.node;
            int d = curr.dist;

            if (visited.contains(node)) continue; 
            visited.add(node);                    

            if (d == k) {
                ans.add(node.val);
                continue; 
            }

            if (node.left != null && !visited.contains(node.left))
                bfs.add(new Pair(node.left, d + 1));

            if (node.right != null && !visited.contains(node.right))
                bfs.add(new Pair(node.right, d + 1));

            TreeNode par = parent.get(node);
            if (par != null && !visited.contains(par))
                bfs.add(new Pair(par, d + 1));
        }

        return ans;
    }
}
