class Solution {
    public boolean check(int[] nums) {
        int count=0;
        int min1=nums[0];
        int min2=0;
        int max1=0;
        int max2=nums[nums.length-1];
        if(nums.length==1){
            return true;
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                max1=nums[i];
                min2=nums[i+1];
                count++;
            }
            
            if(count>1){
                return false;
            }
        }
if(count==0){
return true;
}

        return ((min1>=min2) && (max1>=max2) && (max2<=min1));
         
    }
}