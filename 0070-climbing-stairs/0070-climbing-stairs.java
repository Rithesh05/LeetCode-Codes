class Solution {
    public int steps(int n,int[] dp){
        if(n==0){
            return 1;
        }
        if(dp[n-1]!=-1) return dp[n-1];
        int ways=steps(n-1,dp);
        if((n-2)>=0){
            ways=ways+steps(n-2,dp);
        }
        dp[n-1]=ways;
        return ways;
    }
    public int climbStairs(int n) {
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return steps(n,dp);
    }
}