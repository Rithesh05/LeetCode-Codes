class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sumi=n*(n+1)/2;
        int asum=0;
        for (int num:nums){
            asum+=num;
        }
        return sumi-asum;
        
    }
}