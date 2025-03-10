class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        if(nums[0]>nums[1]){
            return 0;
        }
        if(nums[nums.length-1]>nums[nums.length-2]){
            return nums.length-1;
        }
        int low=1;
        int high=nums.length-2;
        int mid;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }else if(nums[mid]<nums[mid+1]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}