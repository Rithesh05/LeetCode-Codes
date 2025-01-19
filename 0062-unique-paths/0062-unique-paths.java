class Solution {
    public int uniquepaths1(int m,int n,int[][] dp){
        if(m<0 || n<0){
            return 0;
        }
        if(m==0 && n==0){
            return 1;
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        dp[m][n]=uniquepaths1(m-1,n,dp)+uniquepaths1(m,n-1,dp);
        return dp[m][n];
    }
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int[] temp:dp){
            Arrays.fill(temp,-1);
        }
        return uniquepaths1(m-1,n-1,dp);
    }
}