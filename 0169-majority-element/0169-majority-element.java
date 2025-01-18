class Solution {
    public int majorityElement(int[] nums) {
        int el=nums[0];int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==el){
                count++;
            }else{
                count--;
            }
            if(count==0){
                el=nums[i];
                count=1;
            }
        }
        return el;
    }
}