class Solution {
    public boolean dfs(int curr, boolean[] vis, boolean[] pvis, boolean[] safe, int[][] graph) {
        vis[curr] = true;
        pvis[curr] = true;

        for (int nei : graph[curr]) {
            if (!vis[nei]) {
                if (dfs(nei, vis, pvis, safe, graph))
                    return true;
            } else if (pvis[nei]) {
                return true; // cycle detected
            }
        }

        pvis[curr] = false;
        safe[curr] = true; // no cycle from this node
        return false;
    }

    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        boolean[] vis = new boolean[n];
        boolean[] pathvis = new boolean[n];
        boolean[] safe = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                dfs(i, vis, pathvis, safe, graph);
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (safe[i]) {
                result.add(i);
            }
        }

        return result;
    }
}
