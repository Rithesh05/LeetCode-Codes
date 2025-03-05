class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int mid=0;
        int minans=Integer.MAX_VALUE;
        while(low<=high){
            mid=(low+high)/2;
            minans=Math.min(nums[mid],minans);
            if(nums[high]>=nums[mid]){
                high=mid-1;
                
            }else{
                low=mid+1;
            }
        }
        return Math.min(minans,nums[mid]);
    }
}