class Pair {
    int r;
    int c;
    Pair(int r, int c) {
        this.r = r;
        this.c = c;
    }
}

class Solution {
    public int numEnclaves(int[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        int row = grid.length;
        int col = grid[0].length;
        boolean[][] vis = new boolean[row][col];
        int noof1s = 0;

        // Count total number of 1s
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    noof1s++;
                }
            }
        }

        // Traverse boundary rows
        for (int i = 0; i < col; i++) {
            if (grid[0][i] == 1 && !vis[0][i]) {
                q.add(new Pair(0, i));
                noof1s--;
                vis[0][i] = true;
            }
            if (grid[row - 1][i] == 1 && !vis[row - 1][i]) { // ✅ FIXED
                q.add(new Pair(row - 1, i));
                noof1s--;
                vis[row - 1][i] = true;
            }
        }

        // Traverse boundary columns
        for (int i = 0; i < row; i++) {
            if (grid[i][0] == 1 && !vis[i][0]) {
                q.add(new Pair(i, 0));
                noof1s--;
                vis[i][0] = true;
            }
            if (grid[i][col - 1] == 1 && !vis[i][col - 1]) {
                q.add(new Pair(i, col - 1));
                noof1s--;
                vis[i][col - 1] = true;
            }
        }

        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};

        // BFS from boundary 1s
        while (!q.isEmpty()) {
            Pair curr = q.poll();
            for (int i = 0; i < 4; i++) {
                int cr = curr.r + dr[i];
                int cc = curr.c + dc[i];
                if (cr >= 0 && cc >= 0 && cr < row && cc < col &&
                    grid[cr][cc] == 1 && !vis[cr][cc]) {
                    q.add(new Pair(cr, cc));
                    noof1s--;
                    vis[cr][cc] = true;
                }
            }
        }

        return noof1s;
    }
}
