class Solution {
    public int helper(int[] nums,int i,int[] dp){
        if(i==0){
            return nums[i];
        }
        if(i==-1){
            return 0;
        }
        if(dp[i+1]!=-1) return dp[i+1];
        int pick=nums[i]+helper(nums,i-2,dp);
        int nonpick=helper(nums,i-1,dp);
        dp[i+1]=Math.max(pick,nonpick);
        return Math.max(pick,nonpick);
    }
    public int rob(int[] nums) {
        int[] dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return helper(nums,nums.length-1,dp);
    }
}