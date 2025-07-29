class Solution {
    public void dfs(int[][] image, int[][] ans, int cr, int cc, int incolor, int srcolor) {
        int[] vr = {-1, 0, 1, 0};
        int[] vc = {0, 1, 0, -1};

        ans[cr][cc] = srcolor;

        for (int i = 0; i < 4; i++) {
            int dr = cr + vr[i];
            int dc = cc + vc[i];

            if (dr >= 0 && dr < image.length && dc >= 0 && dc < image[0].length &&
                image[dr][dc] == incolor && ans[dr][dc] != srcolor) {
                dfs(image, ans, dr, dc, incolor, srcolor);
            }
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int srcolor) {
        int initial = image[sr][sc];
        

        int[][] ans = image;  
        dfs(image, ans, sr, sc, initial, srcolor);
        return ans;
    }
}
