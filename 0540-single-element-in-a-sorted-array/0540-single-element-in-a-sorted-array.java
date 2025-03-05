class Solution {
    
    public boolean iseven(int num){
        return num%2==0;
    }
    public boolean isodd(int num){
        return num%2!=0;
    }
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums[0]!=nums[1]){
            return nums[0]; 
        }
        if(nums[nums.length-1]!=nums[nums.length-2]){
            return nums[nums.length-1];
        }
        int low=1;
        int high=nums.length-2;
        int mid;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            if(nums[mid]==nums[mid-1]){
                if(isodd(mid-1) && iseven(mid)){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }if(nums[mid]==nums[mid+1]){
                if(isodd(mid) && iseven(mid+1)){
                    high=mid-1;
                }else{
                    low=mid-1;
                }
            }
        }
        return -1;
    }
}