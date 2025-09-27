class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0];
        int pro=1;
        for(int i=0;i<nums.length;i++){
            pro=nums[i];
            max=Math.max(max,pro);
            for(int j=i+1;j<nums.length;j++){
                pro=pro*nums[j];
                max=Math.max(max,pro);
            }
            
        }
        return max;
    }
}