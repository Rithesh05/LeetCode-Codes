class Pair {
    int num;
    int color;
    Pair(int num, int color) {
        this.num = num;
        this.color = color;
    }
}
class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] vis = new int[graph.length];
        Arrays.fill(vis, -1); 

        for (int i = 0; i < graph.length; i++) {
            if (vis[i] == -1) {
                Queue<Pair> q = new LinkedList<>();
                q.add(new Pair(i, 0)); 
                vis[i] = 0;

                while (!q.isEmpty()) {
                    Pair curr = q.poll();
                    for (int neighbor : graph[curr.num]) {
                        if (vis[neighbor] == -1) {
                            vis[neighbor] = 1 - curr.color;
                            q.add(new Pair(neighbor, vis[neighbor]));
                        } else if (vis[neighbor] == curr.color) {
                            return false; 
                        }
                    }
                }
            }
        }

        return true;
    }
}
