class Solution {
    public int longestSubarray(int[] nums) {
        int max=0;
        int bzer=0;
        int azer=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                max=Math.max(max,bzer+azer);
                bzer=azer;
                azer=0;
            }
            if(nums[i]==1){
               azer++;  
            }
           
        }
        if(azer==nums.length){
            return azer-1;
        }
        return Math.max(max,bzer+azer);
    }
}