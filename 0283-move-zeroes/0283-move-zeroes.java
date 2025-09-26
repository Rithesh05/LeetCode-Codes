class Solution {
    public void moveZeroes(int[] nums) {
        int l=0;
        while(l<nums.length && nums[l]!=0){
            l++;
        }
        for(int i=l+1;i<nums.length;i++){
            if(nums[i]!=0){
                nums[l]=nums[i];
                l++;
                nums[i]=0;
            }
        }
    }
}