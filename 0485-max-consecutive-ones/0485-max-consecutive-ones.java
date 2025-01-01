class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max1=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                max=Math.max(max,max1);
                max1=0;
            }else{
                ++max1;
            }
        }
        return Math.max(max,max1);
    }
}