class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] vis = new int[n + 1];   
        int[] cvis = new int[n + 1];  

        for (int i = 0; i < trust.length; i++) {
            int a1 = trust[i][0];
            int b1 = trust[i][1];
            vis[b1]++;     
            cvis[a1]++;    
        }

        for (int i = 1; i <= n; i++) {
            if (vis[i] == n - 1 && cvis[i] == 0) {
                return i;
            }
        }

        return -1;
    }
}
