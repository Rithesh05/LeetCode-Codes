class Solution {
    public int findDuplicate(int[] nums) {
        int index;
        for(int i=0;i<nums.length;i++){
            index=Math.abs(nums[i]);
            if(nums[index]<0){
                return Math.abs(nums[i]);
            }else{
                nums[index]*=-1;
            }
        }
        return 0;
    }
}