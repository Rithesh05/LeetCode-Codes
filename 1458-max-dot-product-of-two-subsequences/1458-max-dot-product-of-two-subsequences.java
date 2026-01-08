class Solution {
    int recur(int[] nums1,int[] nums2,int i,int j,int[][] dp){
        if(i>=nums1.length || j>=nums2.length) return Integer.MIN_VALUE;
        if(dp[i][j]!=-1) return dp[i][j];
        int incl=(nums1[i]*nums2[j])+Math.max(0,recur(nums1,nums2,i+1,j+1,dp));
        int exc1=recur(nums1,nums2,i+1,j,dp);
        int exc2=recur(nums1,nums2,i,j+1,dp);
        dp[i][j]=Math.max(incl,Math.max(exc1,exc2));
        return Math.max(incl,Math.max(exc1,exc2));
    }
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int[][] dp=new int[nums1.length][nums2.length];
        for(int[] temp:dp){
            Arrays.fill(temp,-1);
        }
        int ans=recur(nums1,nums2,0,0,dp);
        return ans;
    }
}