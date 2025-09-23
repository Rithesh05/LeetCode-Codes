class Solution {
    public int helper(int[] cost,int i,int[] dp){
        if(i==0){
            return cost[i];
        }
        if(i==1){
            return cost[i];
        }
        if(i==-1){
            return 0;
        }
        if(dp[i]!=-1) return dp[i];
        int onest,twost;
        if(i==cost.length){
        onest=0+helper(cost,i-1,dp);
        twost=0+helper(cost,i-2,dp);
        }else{
        onest=cost[i]+helper(cost,i-1,dp);
        twost=cost[i]+helper(cost,i-2,dp);
        }
        dp[i]=Math.min(onest,twost);
        return Math.min(onest,twost);
    }
    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length+1];
        Arrays.fill(dp,-1);
        return helper(cost,cost.length,dp);
    }
}