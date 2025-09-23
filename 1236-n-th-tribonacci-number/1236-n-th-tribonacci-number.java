class Solution {
    public int fib(int n,int[] dp){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        if(dp[n]!=-1) return dp[n];
        dp[n]=fib(n-1,dp)+fib(n-2,dp)+fib(n-3,dp);
        return fib(n-1,dp)+fib(n-2,dp)+fib(n-3,dp);
    }
    public int tribonacci(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return fib(n,dp);
    }
}